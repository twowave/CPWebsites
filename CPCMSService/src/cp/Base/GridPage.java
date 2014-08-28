package cp.Base;

public class GridPage<T>
{
    public GridPage(int total, int pageSize,java.util.List<T> list)
    {
        this.List = list;
        this.Total = total;
        this.PageSize = pageSize;
        TotalPage = total / pageSize;
    }
    public GridPage()
    {
      
    }
    public int CurrentPage;
    public int PageSize;
    public int TotalPage;
     public int Total;
     public java.util.List<T> List;
}
