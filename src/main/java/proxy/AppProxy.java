package proxy;

import org.jcsp.lang.One2OneChannel;

import common.RetResult;
import common.error;

/**
 * AppProxy provides an interface for lachesis to communicate with the
 * application.
 */
public interface AppProxy {
	One2OneChannel<byte[]> SubmitCh(); // chan []byte

	One2OneChannel<poset.InternalTransaction> SubmitInternalCh(); // chan poset.InternalTransaction

	RetResult<byte[]> CommitBlock(poset.Block block);

	RetResult<byte[]> GetSnapshot(long blockIndex);

	error Restore(byte[] snapshot);
}