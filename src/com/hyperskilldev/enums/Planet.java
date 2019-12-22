package com.hyperskilldev.enums;


public enum Planet {

    VENUS   (4.869e+24, 6.0518e+6),
    EARTH   (5.976e+24, 6.37814e+6),
    MARS    (6.421e+23, 3.3972e+6),
    JUPITER (1.9e+27,   7.1492e+7),
    SATURN  (5.688e+26, 6.0268e+7),
    URANUS  (8.686e+25, 2.5559e+7);

    private final double m; // mass in kilograms
    private final double r; // radius in meters

    Planet(double mass, double radius) {
        this.m = mass;
        this.r = radius;
    }

    public double mass() { return m; }

    public double radius() { return r; }
}
