import employee.CabinCrewMember;
import employee.EmployeeRank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Pia", EmployeeRank.FLIGHTATTENDANT){};
    }

    @Test
    public void hasName() {
        assertEquals("Pia", cabinCrewMember.getName());
    }

//    @Test
//    public void hasRank() {
//        assertEquals("FLIGHTATTENDANT", cabinCrewMember.getEmployeeRank());
//    }
}
