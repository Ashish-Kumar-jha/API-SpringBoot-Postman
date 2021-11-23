public class EMPWITHDEP {
    int empId;
    int age;
    String department;
    String name;

    public EMPWITHDEP(int empId, int age, String department, String name) {
        this.empId = empId;
        this.age = age;
        this.department = department;
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
