package cp.CMS;

import java.util.List;

import cp.Base.GridPage;
import cp.Base.OperationResult;
import cp.Base.WebInfoModel;

public class WebInfoProvider {
	//获取模板的分页数据
		 public GridPage<List<WebInfoModel>> GetPageList(int currentPage, int pageSize, String searchKey)
	     {         
	         return null;
	     }
		 //按照模板id获取模板内容
	     public  OperationResult<WebInfoModel> GetWebInfoById(int infoId)
	     {
	    	 return null;
	     }
	    //模板添加与更新
	     public  OperationResult<Boolean> WebInfoModelUpdate()
	     {
	    	 return null;
	     }
	     //删除模板
	     public  OperationResult<Boolean> DeleteWebInfoModels(int[] infoIds, int operationBy)
	     {
	    	 return null;
	     }
}
