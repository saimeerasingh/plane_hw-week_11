package employee;

public class Pilot extends Employee {
    EmployeeRank employeerank;
    private String pilotLicenseNumber;

    public Pilot(String name, String pilotLicenseNumber, EmployeeRank employeerank) {
        super(name);
        this.pilotLicenseNumber = pilotLicenseNumber;
        this.employeerank = employeerank;
    }
}
