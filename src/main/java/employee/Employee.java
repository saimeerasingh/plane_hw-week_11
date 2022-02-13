package employee;

public abstract class Employee {
    private String name;
    EmployeeRank employeeRank;

    public Employee(String name, EmployeeRank employeeRank) {
        this.name = name;
        this.employeeRank = employeeRank;
    }
}
