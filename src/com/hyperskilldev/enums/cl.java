package com.hyperskilldev.enums;

public class cl {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            if (planet.mass() > 5.0e+24 && planet.radius() > 6.0e+7) {
                System.out.println(planet);
            }
        }
    }
}
