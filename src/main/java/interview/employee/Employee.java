package interview.employee;

public class Employee
{
    int employeeNumber;
    String employeeName;
    int employeeAge;
    float employeeSalary;

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public float getEmployeeSalary(float target_sal) {
        return employeeSalary;
    }

    public void setEmployeeSalary(float employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public Employee(int employeeNumber, String employeeName, int employeeAge, float employeeSalary) {
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber=" + employeeNumber +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAge=" + employeeAge +
                ", employeeSalary=" + employeeSalary +
                '}';
    }

    public Employee() {
    }
}
