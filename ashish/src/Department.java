public class Department {
    int empId;
    String depName;

    public Department(int empId, String depName) {
        this.empId = empId;
        this.depName = depName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }
}
