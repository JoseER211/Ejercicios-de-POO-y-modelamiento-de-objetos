package main.java.exercise1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Jose David Echavarria Ruiz
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Este programa permite calcular la atracción gravitatoria entre 2 cuerpos del sistema solar." + "\n");

        System.out.println("0. Sol" + "\n" + "1. Mercurio" + "\n" + "2. Venus" + "\n" + "3. Tierra" + "\n" + "4. Marte" +
                "\n" + "5. Júpiter" + "\n" + "6. Saturno" + "\n" + "7. Urano" + "\n" + "8. Neptuno" + "\n" + "9. Plutón" + "\n");

        Integer chooseBody1;
        System.out.println("Elija el primer cuerpo");
        chooseBody1 = Scan();

        Integer chooseBody2;
        System.out.println("Elija el segundo cuerpo");
        chooseBody2 = Scan();

       Map<Integer, CelestialBody> bodies = new HashMap<>();

        bodies.put(0, new Sun());
        bodies.put(1, new Mercury());
        bodies.put(2, new Venus());
        bodies.put(3, new Earth());
        bodies.put(4, new Mars());
        bodies.put(5, new Jupiter());
        bodies.put(6, new Saturn());
        bodies.put(7, new Uranus());
        bodies.put(8, new Neptune());
        bodies.put(9, new Pluto());

       System.out.println("La atracción gravitatoria entre " +  bodies.get(chooseBody1).getName() + " y " + bodies.get(chooseBody2).getName() +
               " es: " + gravitationalPull(bodies.get(chooseBody1), bodies.get(chooseBody2)) + " N");
    }

    /**
     * Escanea un dato por teclado.
     * @return el dato escaneado.
     */
    public static Integer Scan(){
        Scanner data = new Scanner(System.in);
        Integer option = data.nextInt();
        return option;
    }

    /**
     * Calcula la atracción gravitatoria entre los 2 cuerpos elegidos.
     * @param body1 cuerpo 1
     * @param body2 cuerpo 2
     * @return La atracción gravitatoria de los 2 cuerpos elegidos
     */
    public static Double gravitationalPull(CelestialBody body1, CelestialBody body2) {

        Double multiply = multiplyMass(body1, body2);
        Double distance = distanceCalculator(body1, body2);

        final Double gravitationalConstant = 6.67 * Math.pow(10, -11);

        Double calculation = multiply / Math.pow(distance, 2);

        Double resultado = calculation * gravitationalConstant;

        return resultado;
    }

    /**
     * Resta la distancia que los 2 cuerpos tienen con el sol
     * @param body1 cuerpo 1
     * @param body2 cuerpo 2
     * @return la resta de la distancia que tienen los 2 cuerpos con el sol
     */
    public static Double distanceCalculator(CelestialBody body1, CelestialBody body2) {

        if (body1.getDistanceToTheSun() < body2.getDistanceToTheSun()) {
            return  body2.getDistanceToTheSun() - body1.getDistanceToTheSun();
        } else {
            return body1.getDistanceToTheSun() - body2.getDistanceToTheSun();
        }
    }

    /**
     * Multiplica la masa de los 2 cuerpos elegidos
     * @param body1 cuerpo 1
     * @param body2 cuerpo 2
     * @return la multiplicación de la masa de los 2 cuerpos elegidos
     */
    public static Double multiplyMass(CelestialBody body1, CelestialBody body2) {

        return body1.getMass() * body2.getMass();
    }
}



