package cp.CMS;

import java.util.List;

import cp.Base.AdminModel;
import cp.Base.GridPage;
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
	     public  OperationResult<Boolean> VerfiyUser(String loginName,String password)
	     {
	    	 return null;
	     }
}
