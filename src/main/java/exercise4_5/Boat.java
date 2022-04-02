package main.java.exercise4_5;

public class Boat extends Vehicle{
    private String countryOrigin;

    public Boat(String vehicleType, Integer numberPassengers, String crew, Integer numberWheels, String registrationDate, String displacement, String countryOrigin) {
        super(vehicleType, numberPassengers, crew, numberWheels, registrationDate, displacement);
        this.countryOrigin = countryOrigin;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleType='" + vehicleType + '\'' +
                ", numberPassengers=" + numberPassengers +
                ", crew=" + crew +
                ", numberWheels=" + numberWheels +
                ", registrationDate=" + registrationDate +
                ", displacement='" + displacement + '\'' +
                ", countryOrigin='" + countryOrigin + '\'' +
                '}' + "\n";
    }
}
