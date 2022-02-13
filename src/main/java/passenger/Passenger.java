package passenger;

public class Passenger {
    private String passengerName;
    private int numberOfBags;

    public Passenger(String passengerName, int numberOfBags) {
        this.passengerName = passengerName;
        this.numberOfBags = numberOfBags;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }
}
