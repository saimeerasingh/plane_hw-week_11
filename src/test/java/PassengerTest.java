import org.junit.Before;
import org.junit.Test;
import passenger.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Nia",3);
    }

    @Test
    public void hasName() {
       assertEquals("Nia", passenger.getPassengerName());
    }


}
