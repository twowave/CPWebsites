package cp.CMS;

import java.util.List;

import cp.Base.GridPage;
import cp.Base.OperationResult;
import cp.Base.PageTemplateModel;

public class PageTemplateProvider {
	//获取模板的分页数据
	 public GridPage<List<PageTemplateModel>> GetTemplatePageList(int currentPage, int pageSize, String searchKey)
     {         
         return null;
     }
	 //按照模板id获取模板内容
     public  OperationResult<String> GetTemplateById(int templateId)
     {
    	 return null;
     }
    //模板添加与更新
     public  OperationResult<Boolean> PageTemplateUpdate(int pageTemplateId, String templateName, String templateContent, int templateType, int createBy, int modifyBy)
     {
    	 return null;
     }
     //删除模板
     public  OperationResult<Boolean> DeletePageTemplates(int[] templateIds, int operationBy)
     {
    	 return null;
     }
}
