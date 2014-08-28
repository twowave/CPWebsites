package cp.Base;

public class OperationResult<T>
{
     public OperationResult(T data,Boolean result)
     {
         Data = data;
         Result = result;
     }
     public OperationResult(Boolean result)
     {
    	 Result = result;
     }
     
    public Boolean Result;
      
    public String Message;
      
    public T Data;
      
    public int Code;
}