package net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.time.Duration;

import org.apache.log4j.Logger;

import common.RetResult;
import common.error;

public class TCPTransport {

	public static final error errNotAdvertisable = error.Errorf("local bind address is not advertisable");
	public static final error errNotTCP = error.Errorf("local address is not a TCP address");

	interface TCPTransportCreator {
		public NetworkTransport transportCreator(StreamLayer stream);
	}

	/**
	 * Creates a new TCPTransport
	 * @param bindAddr
	 * @param advertise
	 * @param maxPool
	 * @param timeout
	 * @param logger
	 * @return a NetworkTransport that is built on top of
	 * a TCP streaming transport layer, with log output going to the supplied Logger
	 */
	public static RetResult<NetworkTransport> NewTCPTransport(String bindAddr, InetAddress advertise, int maxPool,
			Duration timeout, Logger logger) {
		return newTCPTransport(bindAddr, advertise, maxPool, timeout, new TCPTransportCreator() {
			public NetworkTransport transportCreator(StreamLayer stream) {
				return new NetworkTransport(stream, maxPool, timeout, logger);
			}
		});
	}

	public static RetResult<NetworkTransport> newTCPTransport(String bindAddr, InetAddress advertise, int maxPool,
			Duration timeout, TCPTransportCreator transportCreator) {
		// Try to bind
//		list, err := net.Listen("tcp", bindAddr);
		ServerSocket list;
		try {
			list = new ServerSocket(0, 50, InetAddress.getByName(bindAddr));
		} catch (IOException e) {
			return new RetResult<NetworkTransport>(null, error.Errorf(e.getMessage()));
		}

		// Create stream
		TCPStreamLayer stream = new TCPStreamLayer(advertise, list);

		// Verify that we have a usable advertise address
		InetAddress addr = stream.Addr();
		boolean ok = addr != null;
		try {
			if (!ok) {
				list.close();
				return new RetResult<NetworkTransport>(null, errNotTCP);
			}
			if (addr.getHostAddress().isEmpty()) {// .IP.IsUnspecified()) {
				list.close();
				return new RetResult<NetworkTransport>(null, errNotAdvertisable);
			}
		} catch (IOException e) {
			return new RetResult<NetworkTransport>(null, error.Errorf(e.getMessage()));
		}
		// Create the network transport
		NetworkTransport trans = transportCreator.transportCreator(stream);
		return new RetResult<NetworkTransport>(trans, null);
	}
}