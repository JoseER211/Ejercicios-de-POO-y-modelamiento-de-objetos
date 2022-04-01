package main.java.exercise4_5;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Este programa permite ingresar vehículos en el ferry");
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite los datos del vehículo." + i);

            System.out.println("Tipo de vehículo: ");
            String vehicleType = scanText().toLowerCase();

            System.out.println("Número de pasajeros: ");
            Integer numberPassengers = scanNumber();

            System.out.println("¿Tiene tripulación? si/no");
            String crew = scanText().toLowerCase();

            System.out.println("Número de ruedas: ");
            Integer numberWheels = scanNumber();

            System.out.println("Fecha de matrícula: (DD/MM/YYYY)");
            String registrationDate = scanText();

            System.out.println("medio por el que se desplaza: ");
            String displacement = scanText().toLowerCase();


            Vehicle vehicle = new Vehicle(vehicleType, numberPassengers, crew, numberWheels, registrationDate, displacement);


            vehicles.add(vehicle);
        }

        System.out.println(vehicles.toString());
    }


    public static Integer scanNumber(){
        Scanner input = new Scanner(System.in);
        Integer option = input.nextInt();
        return option;
    }

    public static String scanText(){
        Scanner input = new Scanner(System.in);
        String option = input.next();
        return option;
    }
}
