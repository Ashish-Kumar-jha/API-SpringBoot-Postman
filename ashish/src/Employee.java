public class Employee {
    int empId;
    String empName;
    int age;
    public Employee(int empId, String empName, int age) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
