package main.java.ejercicio1;

public abstract class CelestialBody {
    private Integer id;
    private String name;
    private Double mass;
    private Double density;
    private Double diameter;
    private Double DistanceToTheSun;

    public CelestialBody(Integer id, String name, Double mass, Double density, Double diameter, Double distanceToTheSun) {
        this.id = id;
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        DistanceToTheSun = distanceToTheSun;
    }
}
