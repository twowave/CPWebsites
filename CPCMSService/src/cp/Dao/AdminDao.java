package cp.Dao;


import java.util.List;

import cp.Base.AdminModel;
import cp.Base.GridPage;
import cp.Base.OperationResult;

public class AdminDao {
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
     public  OperationResult<AdminModel> VerfiyUser(String loginName,String password)
     {
    	 return null;
     }
}
