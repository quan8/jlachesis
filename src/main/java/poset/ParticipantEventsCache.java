package poset;

import java.util.Map;

import common.StoreErrType;
import common.RetResult;
import common.RollingIndexMap;
import common.StoreErr;
import common.error;
import peers.Peer;

public class ParticipantEventsCache {
	peers.Peers participants;
	RollingIndexMap rim;

	class Key {
		String x;
		String y;

		public String ToString() {
			return String.format("{%s, %s}", x, y);
		}
	}

	public ParticipantEventsCache(int size, peers.Peers participants) {
		this.participants = participants;
		this.rim = new RollingIndexMap("ParticipantEvents", size, participants.ToIDSlice());
	}

	public RetResult<Long> participantID(String participant) {
		Peer peer = participants.getByPubKey().get(participant);

		if (peer == null) {
			return new RetResult<Long>( (long) -1,
			StoreErr.newStoreErr("ParticipantEvents", StoreErrType.SkippedIndex, participant));

		}

		return new RetResult<Long>(peer.GetID(), null);
	}

	//return participant events with index > skip
	public RetResult<String[]> Get(String participant, long skipIndex) {
		RetResult<Long> participantID = participantID(participant);
		long id = participantID.result;
		error err= participantID.err;
		if (err != null) {
			return new RetResult<String[]>(new String[]{}, err);
		}

		RetResult<Object[]> get = rim.Get(id, skipIndex);
		Object[] pe = get.result;
		err = get.err;
		if (err != null) {
			return new RetResult<String[]>(new String[]{}, err);
		}

		String[] res = new String[pe.length];
		for (int k = 0; k < pe.length; k++) {
			res[k] = pe[k].toString();
		}
		return new RetResult<String[]>(res, null);
	}

	public RetResult<String> GetItem(String participant, long index) {
		RetResult<Long> participantID = participantID(participant);
		long id = participantID.result;
		error err = participantID.err;
		if (err != null) {
			return new  RetResult<String>("", err);
		}

		RetResult<Object> getItem = rim.GetItem(id, index);
		Object item = getItem.result;
		err = getItem.err;
		if (err != null) {
			return new  RetResult<String>("", err);
		}
		return new  RetResult<String>(item.toString(), null);
	}

	public RetResult<String> GetLast(String participant) {
		RetResult<Long> participantID = participantID(participant);
		long id = participantID.result;
		error err = participantID.err;
		if (err != null) {
			return new RetResult<String>("", err);
		}

		RetResult<Object> getLast = rim.GetLast(id);
		Object last = getLast.result;
		err = getLast.err;
		if (err != null) {
			return new RetResult<String>("", err);
		}
		return new RetResult<String>(last.toString(), null);
	}

	public RetResult<String> GetLastConsensus(String participant) {
		RetResult<Long> participantID = participantID(participant);
		long id = participantID.result;
		error err = participantID.err;
		if (err != null) {
			return new RetResult<String>("", err);
		}

		RetResult<Object> getLast = rim.GetLast(id);
		Object last = getLast.result;
		err = getLast.err;
		if (err != null) {
			return new RetResult<String>("", err);
		}
		return new RetResult<String>(last.toString(), null);
	}

	public error Set(String participant, String hash, long index) {
		RetResult<Long> participantID = participantID(participant);
		long id = participantID.result;
		error err = participantID.err;
		if (err != null) {
			return err;
		}
		return rim.Set(id, hash, index);
	}

	//returns [participant id] => lastKnownIndex
	public Map<Long,Long> Known() {
		return rim.Known();
	}

	public error Reset() {
		return rim.Reset();
	}

	public void Import(ParticipantEventsCache other) {
		rim.Import(other.rim);
	}
}