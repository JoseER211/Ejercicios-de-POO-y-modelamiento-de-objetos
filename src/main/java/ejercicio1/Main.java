package main.java.ejercicio1;



public class Main {
    public static void main(String[] args) {

        Earth planeta1 = new Earth();

        Mars planeta2 = new Mars();


        System.out.println("La atracción gravitatoria entre " + planeta1.getName() + " y " + planeta2.getName() + " es: " + gravitationalPull(planeta1, planeta2) + " N");

    }

    public static Double gravitationalPull(Earth planeta1, Mars planeta2) {

        Double multiply = multiplyMass(planeta1, planeta2);
        Double distance = distanceCalculator(planeta1, planeta2);

        final Double gravitationalConstant = 6.67 * Math.pow(10, -11);

        Double calculation = multiply / Math.pow(distance, 2);

        Double resultado = calculation * gravitationalConstant;

        return resultado;
    }

    public static Double distanceCalculator(Earth planeta1, Mars planeta2) {

        if (planeta1.getDistanceToTheSun() < planeta2.getDistanceToTheSun()) {
            return  planeta2.getDistanceToTheSun() - planeta1.getDistanceToTheSun();
        } else {
            return planeta1.getDistanceToTheSun() - planeta2.getDistanceToTheSun();
        }
    }

    public static Double multiplyMass(Earth planeta1, Mars planeta2) {

        return planeta1.getMass() * planeta2.getMass();
    }
}



