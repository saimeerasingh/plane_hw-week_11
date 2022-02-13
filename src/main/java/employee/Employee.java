package employee;

public abstract class Employee {
    private String name;
    EmployeeRank employeeRank;

    public Employee(String name, EmployeeRank employeeRank) {
        this.name = name;
        this.employeeRank = employeeRank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeRank getEmployeeRank() {
        return employeeRank;
    }

    public void setEmployeeRank(EmployeeRank employeeRank) {
        this.employeeRank = employeeRank;
    }
}
