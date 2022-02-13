package employee;

public enum EmployeeRank {
    CAPTAIN("Captain"),
    FIRSTOFFICER("First Officer"),
    PURSUER("Pursuer"),
    FLIGHTATTENDANT("Flight Attendant");

    private final String value;


    EmployeeRank(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
