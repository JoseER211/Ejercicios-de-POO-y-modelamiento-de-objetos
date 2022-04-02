package main.java.exercise4_5;

public class Truck extends Vehicle{
    private Double height;

    public Truck(String vehicleType, Integer numberPassengers, String crew, Integer numberWheels, String registrationDate, String displacement, Double height) {
        super(vehicleType, numberPassengers, crew, numberWheels, registrationDate, displacement);
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
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
                ", height='" + height + '\'' +
                '}' + "\n";
    }
}
