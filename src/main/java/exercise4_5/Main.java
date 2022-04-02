package main.java.exercise4_5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Jose David Echavarria Ruiz
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("Este programa permite ingresar vehículos en el ferry");

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("\n" + "¿Qué vehículo desea ingresar?");
            System.out.println("1. Carro" + "\n" + "2. Moto" + "\n" + "3. Camión" + "\n" + "4. Bicicleta" + "\n" + "5. Lancha") ;
            Integer vehicleOption = scanNumber();
            switch (vehicleOption){
                case 1:
                    vehicles.add(car());
                    break;
                case 2:
                    vehicles.add(motorcycle());
                    break;
                case 3:
                    vehicles.add(truck());
                    break;
                case 4:
                    vehicles.add(bicycle());
                    break;
                case 5:
                    vehicles.add(boat());
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    i = i-1;
                    break;
            }
        }

        System.out.println();
        System.out.println(vehicles.toString());
    }

    /**
     * Escanea un dato Entero por teclado.
     * @return el dato escaneado.
     */

    public static Integer scanNumber(){
        Scanner input = new Scanner(System.in);
        Integer option = input.nextInt();
        return option;
    }

    /**
     * Escanea un dato Flotante por teclado.
     * @return el dato escaneado.
     */

    public static Double scanfloatNumber(){
        Scanner input = new Scanner(System.in);
        Double option = input.nextDouble();
        return option;
    }

    /**
     * Escanea un dato Cadena por teclado.
     * @return el dato escaneado.
     */

    public static String scanText(){
        Scanner input = new Scanner(System.in);
        String option = input.next();
        return option;
    }

    /**
     * Crea un nuevo vehículo con las características de un carro.
     * @return el vehículo carro.
     */

    public static Vehicle car(){

        System.out.println("\n" +"Digite los datos del vehículo." + "\n");

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

        System.out.println("Medio por el que se desplaza: ");
        String displacement = scanText().toLowerCase();

        System.out.println("Número de puertas: ");
        Integer numberDoors = scanNumber();

        Car car = new Car(vehicleType, numberPassengers, crew, numberWheels, registrationDate, displacement, numberDoors);

        return car;
    }

    /**
     * Crea un nuevo vehículo con las características de una moto.
     * @return el vehículo moto.
     */

    public static Vehicle motorcycle(){

        System.out.println("\n" +"Digite los datos del vehículo." + "\n");

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

        System.out.println("Medio por el que se desplaza: ");
        String displacement = scanText().toLowerCase();

        System.out.println("Tipo de gas: ");
        String gastype = scanText().toLowerCase();

        Motorcycle motorcycle = new Motorcycle(vehicleType, numberPassengers, crew, numberWheels, registrationDate, displacement, gastype);

        return motorcycle;
    }

    /**
     * Crea un nuevo vehículo con las características de un camión.
     * @return el vehículo camión.
     */

    public static Vehicle truck(){

        System.out.println("\n" +"Digite los datos del vehículo." + "\n");

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

        System.out.println("Medio por el que se desplaza: ");
        String displacement = scanText().toLowerCase();

        System.out.println("Altura: ");
        double height = scanfloatNumber();

        Truck truck = new Truck(vehicleType, numberPassengers, crew, numberWheels, registrationDate, displacement, height);

        return truck;
    }

    /**
     * Crea un nuevo vehículo con las características de una bicicleta.
     * @return el vehículo bicicleta.
     */

    public static Vehicle bicycle(){

        System.out.println("\n" +"Digite los datos del vehículo." + "\n");

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

        System.out.println("Medio por el que se desplaza: ");
        String displacement = scanText().toLowerCase();

        System.out.println("Color: ");
        String color = scanText().toLowerCase();

        Bicycle bicycle = new Bicycle(vehicleType, numberPassengers, crew, numberWheels, registrationDate, displacement, color);

        return bicycle;
    }

    /**
     * Crea un nuevo vehículo con las características de una lancha.
     * @return el vehículo lancha.
     */
    
    public static Vehicle boat(){

        System.out.println("\n" +"Digite los datos del vehículo." + "\n");

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

        System.out.println("Medio por el que se desplaza: ");
        String displacement = scanText().toLowerCase();

        System.out.println("País de origen: ");
        String countryOrigin = scanText().toLowerCase();

        Boat boat = new Boat(vehicleType, numberPassengers, crew, numberWheels, registrationDate, displacement, countryOrigin);

        return boat;
    }
}
