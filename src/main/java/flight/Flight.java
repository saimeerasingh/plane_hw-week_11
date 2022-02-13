package flight;

import employee.CabinCrewMember;
import employee.Pilot;
import passenger.Passenger;
import plane.Plane;

import java.util.ArrayList;
import java.util.List;

public class Flight {
   private ArrayList <Pilot> pilots;
   private ArrayList <CabinCrewMember> cabinCrewMembers;
   private ArrayList <Passenger> passengers;
   private Plane plane;
   private String flightNumber;
   private String destination;
   private String departureAirport;
   private String departureTime;

        public Flight(ArrayList<Pilot> pilots, ArrayList<CabinCrewMember> cabinCrewMembers,
                      Plane plane, String flightNumber,
                      String destination, String departureAirport, String departureTime) {
        this.pilots = pilots;
        this.cabinCrewMembers = cabinCrewMembers;
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }
    

}
