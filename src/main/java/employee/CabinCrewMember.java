package employee;

public class CabinCrewMember extends Employee {
    EmployeeRank employeeRank;

    public CabinCrewMember(String name, EmployeeRank employeeRank) {
        super(name);
        this.employeeRank = employeeRank;
    }
    
}
