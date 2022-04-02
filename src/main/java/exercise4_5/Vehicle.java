package main.java.exercise4_5;

/**
 * @author Jose David Echavarria Ruiz
 */
public class Vehicle {
    protected String vehicleType;
    protected Integer numberPassengers;
    protected String crew;
    protected Integer numberWheels;
    protected String registrationDate;
    protected String displacement;

    public Vehicle(String vehicleType, Integer numberPassengers, String crew, Integer numberWheels,
                   String registrationDate, String displacement) {
        this.vehicleType = vehicleType;
        this.numberPassengers = numberPassengers;
        this.crew = crew;
        this.numberWheels = numberWheels;
        this.registrationDate = registrationDate;
        this.displacement = displacement;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Integer getNumberPassengers() {
        return numberPassengers;
    }

    public void setNumberPassengers(Integer numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public Integer getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(Integer numberWheels) {
        this.numberWheels = numberWheels;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
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
                '}' + "\n";
    }
}
