package cp.CMS;

import java.util.Date;
import java.util.List;

import cp.Base.AdminModel;
import cp.Base.GridPage;
import cp.Base.MemeryStore;
import cp.Base.OperationResult;


public class AdminProvider {
	    //��ȡ����Ա�ķ�ҳ����
		 public GridPage<List<AdminModel>> GetPageList(int currentPage, int pageSize, String searchKey)
	     {         
	         return null;
	     }
		 //����ģ��id��ȡģ������
	     public  OperationResult<AdminModel> GetAdminById(int adminId)
	     {
	    	 return null;
	     }
	    //����Ա��������
	     public  OperationResult<Boolean> AdminUpdate()
	     {
	    	 return null;
	     }
	     //ɾ������Ա
	     public  OperationResult<Boolean> DeleteAdmins(int[] adminIds, int operationBy)
	     {
	    	 return null;
	     }
	     //��֤�û�������
	     public  long VerfiyUser(String loginName,String password)
	     {
	    	 Date t1=new Date();
	    	 long sessionId=t1.getTime();
	    	 int adminId=0;
	    	 
	    	 if(adminId>0)
	    	 LoginInfoStore(adminId,sessionId);
	    	 return sessionId;
	     }
	     private void LoginInfoStore(int adminId,long sessionId){
	    	 MemeryStore.GetInstance().Store(adminId, sessionId);
	     }
	     public Boolean IsLogin(int adminId,long sessionId){
	    	 return false;
	     }
}
