import employee.CabinCrewMember;
import employee.EmployeeRank;
import employee.Pilot;
import flight.Flight;
import org.junit.Before;
import org.junit.Test;
import plane.Plane;
import plane.PlaneType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlightTest {
    Flight flight;
    Pilot pilot;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;
    Plane plane;

    @Before
    public void before(){
        ArrayList<Pilot> pilots = new ArrayList<>();
        pilot = new Pilot("Hina", EmployeeRank.CAPTAIN,"HSD2354g");
        pilots.add(pilot);

        ArrayList<CabinCrewMember> cabinCrewMembers = new ArrayList<>();
        cabinCrewMember1 = new CabinCrewMember("Rekha",EmployeeRank.FLIGHTATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Jaya",EmployeeRank.FLIGHTATTENDANT);
        cabinCrewMember3 = new CabinCrewMember("Sushma",EmployeeRank.FLIGHTATTENDANT);
        cabinCrewMembers.add(cabinCrewMember1);
        cabinCrewMembers.add(cabinCrewMember2);
        cabinCrewMembers.add(cabinCrewMember3);

        plane = new Plane(PlaneType.BOEING717);

        flight = new Flight(pilots,cabinCrewMembers,plane,"SS365",
                "CJB","LDN","19:00",340);
    }


    @Test
    public void hasPilot(){
        assertTrue("there should be at least 1 pilot", flight.getPilots().size() > 0);
    }

    @Test
    public void hasCabinCrewMember(){
        assertTrue("there should be more than 1 cabin crew member", flight.getCabinCrewMembers().size()> 1);
    }

    @Test
    public void canAddPassenger(){
        flight.addPassengers("Shaank",4);
        assertEquals(1,flight.getPassengers().size());
    }
}
