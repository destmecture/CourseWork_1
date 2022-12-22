public class Employee {
    private String employeeName;
    private int department;
    private int salary;
    private int id;
    private static int countId;

    public Employee(String employeeName, int department, int salary) {
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
        id = ++countId;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ФИО: " + employeeName + " Отдел: " + department + " Зарплата: " + salary + " Id: " + id ;
    }
}