package main.java.exercise4_5;

public class Car extends Vehicle{
    private Integer numberDoors;

    public Car(String vehicleType, Integer numberPassengers, String crew, Integer numberWheels, String registrationDate, String displacement, Integer numberDoors) {
        super(vehicleType, numberPassengers, crew, numberWheels, registrationDate, displacement);
        this.numberDoors = numberDoors ;
    }

    public Integer getNumberDoors() {
        return numberDoors;
    }

    public void setNumberDoors(Integer numberDoors) {
        this.numberDoors = numberDoors;
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
                ", numberDoors='" + numberDoors + '\'' +
                '}' + "\n";
    }
}
