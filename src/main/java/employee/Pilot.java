package employee;

public class Pilot extends Employee {

    private String pilotLicenseNumber;

    public Pilot(String name,EmployeeRank employeeRank, String pilotLicenseNumber) {
        super(name,employeeRank);
        this.pilotLicenseNumber = pilotLicenseNumber;

    }

    public String getPilotLicenseNumber() {
        return pilotLicenseNumber;
    }

    public void setPilotLicenseNumber(String pilotLicenseNumber) {
        this.pilotLicenseNumber = pilotLicenseNumber;
    }
}
