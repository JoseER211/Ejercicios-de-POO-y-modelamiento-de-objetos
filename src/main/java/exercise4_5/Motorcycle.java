package main.java.exercise4_5;

public class Motorcycle extends Vehicle{
    private String gasType;
    public Motorcycle(String vehicleType, Integer numberPassengers, String crew, Integer numberWheels, String registrationDate, String displacement, String gasType) {
        super(vehicleType, numberPassengers, crew, numberWheels, registrationDate, displacement);
        this.gasType = gasType;
    }

    public String getGasType() {
        return gasType;
    }

    public void setGasType(String gasType) {
        this.gasType = gasType;
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
                ", gasType='" + gasType + '\'' +
                '}' + "\n";
    }
}
