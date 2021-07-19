package ksolves.Employee.EmployeeCsvDb.Models;

public class Request {
    private int PageNo;
    private int PageSize;

    public Request(int pageNo, int pageSize) {
        PageNo = pageNo;
        PageSize = pageSize;
    }

    public int getPageNo() {
        return PageNo;
    }

    public void setPageNo(int pageNo) {
        PageNo = pageNo;
    }

    public int getPageSize() {
        return PageSize;
    }

    public void setPageSize(int pageSize) {
        PageSize = pageSize;
    }
}
