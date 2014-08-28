package cp.CMS;

import java.util.List;

import cp.Base.AdminModel;
import cp.Base.GridPage;
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
	     public  OperationResult<Boolean> VerfiyUser(String loginName,String password)
	     {
	    	 return null;
	     }
}
