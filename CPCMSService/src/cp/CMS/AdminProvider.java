package cp.CMS;

import java.util.Date;
import java.util.List;

import cp.Base.AdminModel;
import cp.Base.GridPage;
import cp.Base.MemeryStore;
import cp.Base.OperationResult;
import cp.Dao.AdminDao;


public class AdminProvider {
		private AdminDao dao;
		public AdminProvider(){
			dao=new AdminDao();
		}
	    //��ȡ����Ա�ķ�ҳ����
		 public GridPage<List<AdminModel>> GetPageList(int currentPage, int pageSize, String searchKey)
	     {         
	         return dao.GetPageList(currentPage, pageSize, searchKey);
	     }
		 //����ģ��id��ȡģ������
	     public  OperationResult<AdminModel> GetAdminById(int adminId)
	     {
	    	 return dao.GetAdminById(adminId);
	     }
	    //����Ա��������
	     public  OperationResult<Boolean> AdminUpdate()
	     {
	    	 return null;
	     }
	     //ɾ������Ա
	     public  OperationResult<Boolean> DeleteAdmins(int[] adminIds, int operationBy)
	     {
	    	 return dao.DeleteAdmins(adminIds, operationBy);
	     }
	     //��֤�û�������
	     public  long VerfiyUser(String loginName,String password)
	     {
	    	 Date t1=new Date();
	    	 long sessionId=t1.getTime();
	    	 int adminId=0;
	    	 OperationResult<AdminModel> info=dao.VerfiyUser(loginName, password);
	    	 if(adminId>0)
	    	 LoginInfoStore(adminId,sessionId);
	    	 return sessionId;
	     }
	     private void LoginInfoStore(int adminId,long sessionId){
	    	 MemeryStore.GetInstance().Store(adminId, sessionId);
	     }
	     public Boolean IsLogin(int adminId,long sessionId){
	    	 int admin=-1;
	    	 admin=MemeryStore.GetInstance().Get(sessionId);
	    	 if(admin==adminId) return true;
	    	 return false;
	     }
}
