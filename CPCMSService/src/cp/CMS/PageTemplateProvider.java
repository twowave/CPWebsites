package cp.CMS;

import java.util.List;

import cp.Base.GridPage;
import cp.Base.OperationResult;
import cp.Base.PageTemplateModel;

public class PageTemplateProvider {
	//��ȡģ��ķ�ҳ����
	 public GridPage<List<PageTemplateModel>> GetTemplatePageList(int currentPage, int pageSize, String searchKey)
     {         
         return null;
     }
	 //����ģ��id��ȡģ������
     public  OperationResult<String> GetTemplateById(int templateId)
     {
    	 return null;
     }
    //ģ����������
     public  OperationResult<Boolean> PageTemplateUpdate(int pageTemplateId, String templateName, String templateContent, int templateType, int createBy, int modifyBy)
     {
    	 return null;
     }
     //ɾ��ģ��
     public  OperationResult<Boolean> DeletePageTemplates(int[] templateIds, int operationBy)
     {
    	 return null;
     }
}
