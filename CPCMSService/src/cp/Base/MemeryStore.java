package cp.Base;

import java.util.HashMap;


public class MemeryStore {
	private static HashMap  _store=new HashMap ();
	private static MemeryStore _instance=new MemeryStore();
	public static MemeryStore GetInstance(){
		return _instance;
	}
	@SuppressWarnings("unchecked")
	public void Store(int adminId,long sessionId){
		_store.put(sessionId, adminId);
	}
	public int Get(long sessionId){
		int adminId=-1;
		if(_store.containsKey(sessionId))
			adminId=Integer.parseInt(_store.get(sessionId).toString());
		return adminId;
	}
}
