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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMass() {
        return mass;
    }

    public void setMass(Double mass) {
        this.mass = mass;
    }

    public Double getDensity() {
        return density;
    }

    public void setDensity(Double density) {
        this.density = density;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    public Double getDistanceToTheSun() {
        return DistanceToTheSun;
    }

    public void setDistanceToTheSun(Double distanceToTheSun) {
        DistanceToTheSun = distanceToTheSun;
    }

    @Override
    public String toString() {
        return "CelestialBody{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mass=" + mass +
                ", density=" + density +
                ", diameter=" + diameter +
                ", DistanceToTheSun=" + DistanceToTheSun +
                '}' + "\n";
    }
}
