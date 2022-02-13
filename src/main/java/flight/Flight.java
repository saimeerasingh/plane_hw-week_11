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
   private int seats;

        public Flight(ArrayList<Pilot> pilots, ArrayList<CabinCrewMember> cabinCrewMembers,
                      Plane plane, String flightNumber,
                      String destination, String departureAirport, String departureTime,int seats) {
        this.pilots = pilots;
        this.cabinCrewMembers = cabinCrewMembers;
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.seats = seats;
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public void setPilots(ArrayList<Pilot> pilots) {
        this.pilots = pilots;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public void setCabinCrewMembers(ArrayList<CabinCrewMember> cabinCrewMembers) {
        this.cabinCrewMembers = cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void addPassengers(String passengerName, int numberOfBags) {
            this.passengers.add(new Passenger(passengerName,numberOfBags));
    }


    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }
    public int getAvailableSeats(){
            return 0;
          //TODO
    }

    public String takeOff(){
            return "";
//            TODO
    }

    public String sendAnnouncements(){
            return "";
//            TODO
    }

}
