public class Employee extends Worker {
    private long EmployeeId;
    private String hireDate;
    private static int employeeNo = 1;
    public Employee(String name, String birthDate, String hireDate) {
        super(name,birthDate);
        this.EmployeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId=" + EmployeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
