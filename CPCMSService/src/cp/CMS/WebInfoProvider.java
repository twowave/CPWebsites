package cp.CMS;

import java.util.List;

import cp.Base.GridPage;
import cp.Base.OperationResult;
import cp.Base.WebInfoModel;

public class WebInfoProvider {
	//��ȡģ��ķ�ҳ����
		 public GridPage<List<WebInfoModel>> GetPageList(int currentPage, int pageSize, String searchKey)
	     {         
	         return null;
	     }
		 //����ģ��id��ȡģ������
	     public  OperationResult<WebInfoModel> GetWebInfoById(int infoId)
	     {
	    	 return null;
	     }
	    //ģ����������
	     public  OperationResult<Boolean> WebInfoModelUpdate()
	     {
	    	 return null;
	     }
	     //ɾ��ģ��
	     public  OperationResult<Boolean> DeleteWebInfoModels(int[] infoIds, int operationBy)
	     {
	    	 return null;
	     }
}
