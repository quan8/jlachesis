package peers;

import java.util.Comparator;

public class PeerComparatorByPubHex implements Comparator<Peer> {

	public PeerComparatorByPubHex() {
	}

	public int compare(Peer o1, Peer o2) {
		return o1.PubKeyHex.compareTo(o2.PubKeyHex);
	}
}
