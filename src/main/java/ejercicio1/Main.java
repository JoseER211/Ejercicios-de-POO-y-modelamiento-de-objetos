package main.java.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<CelestialBody> bodies = new ArrayList<>();

        bodies.add(new CelestialBody(0, "Sol", 1.989*Math.pow(10, 30), 1.409, 1.3927, 0.0));
        bodies.add(new CelestialBody(1, "Mercurio", 3.3010*Math.pow(10, 23), 5.427, 4.878, 57.909227));
        bodies.add(new CelestialBody(2, "Venus", 4.8673*Math.pow(10, 24), 5.243, 12.100, 108.209475));
        bodies.add(new CelestialBody(3, "Tierra", 5.9722*Math.pow(10, 24), 5.513, 12.742, 149.598262));
        bodies.add(new CelestialBody(4, "Marte", 6.4169*Math.pow(10, 23), 3.934, 6794.4, 227.943824));
        bodies.add(new CelestialBody(5, "Júpiter", 1.8981*Math.pow(10, 27), 1.326, 143.884, 778.340821));
        bodies.add(new CelestialBody(6, "Saturno", 5.6832*Math.pow(10, 26), 0.687, 108.728, 1.426666422));
        bodies.add(new CelestialBody(7, "Urano", 8.6810*Math.pow(10, 25), 1.270, 51.118, 2.870658186));
        bodies.add(new CelestialBody(8, "Neptuno", 1.0241*Math.pow(10, 26), 1.638, 49.500, 4.498396441));
        bodies.add(new CelestialBody(9, "Plutón", 1.25*Math.pow(10, 22), 1.9, 2370.0, 5.934456500));

        System.out.println(bodies.get(3).getName());

    }

}
