package cp.CMS;

import java.util.Date;
import java.util.List;

import cp.Base.AdminModel;
import cp.Base.GridPage;
import cp.Base.MemeryStore;
import cp.Base.OperationResult;


public class AdminProvider {
	    //获取管理员的分页数据
		 public GridPage<List<AdminModel>> GetPageList(int currentPage, int pageSize, String searchKey)
	     {         
	         return null;
	     }
		 //按照模板id获取模板内容
	     public  OperationResult<AdminModel> GetAdminById(int adminId)
	     {
	    	 return null;
	     }
	    //管理员添加与更新
	     public  OperationResult<Boolean> AdminUpdate()
	     {
	    	 return null;
	     }
	     //删除管理员
	     public  OperationResult<Boolean> DeleteAdmins(int[] adminIds, int operationBy)
	     {
	    	 return null;
	     }
	     //验证用户和密码
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
