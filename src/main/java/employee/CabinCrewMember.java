package employee;

public class CabinCrewMember extends Employee {


    public CabinCrewMember(String name, EmployeeRank employeeRank) {
        super(name, employeeRank);

    }

    public String sendAnnouncements(){
        return "Please fasten your seatbelts";
    }

}
