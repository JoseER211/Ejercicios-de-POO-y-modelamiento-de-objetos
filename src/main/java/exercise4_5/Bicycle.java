package main.java.exercise4_5;

public class Bicycle extends Vehicle{
    private String color;

    public Bicycle(String vehicleType, Integer numberPassengers, String crew, Integer numberWheels, String registrationDate, String displacement, String color) {
        super(vehicleType, numberPassengers, crew, numberWheels, registrationDate, displacement);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
                ", color='" + color + '\'' +
                '}' + "\n";
    }
}
