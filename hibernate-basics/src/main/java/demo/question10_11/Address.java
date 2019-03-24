package demo.question10_11;

/*
 * Question 10
 * Create a class Address for Author with instance variables streetNumber, location, State.
 * */
public class Address {
    String state;
    String location;
    String streetNumber;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", location='" + location + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                '}';
    }
}
