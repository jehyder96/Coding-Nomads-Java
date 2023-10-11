package labs_examples.enumerations.labs;

// Parameterized enumeration - passing values to the constructor of the enum
enum Planet { // set to private by default - only accessible within the enum

    MERCURY(3.303e+23, 2.4397e6), // mass and radius
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6);

    private final double mass;   // kg
    private final double radius; // km

    Planet(double mass, double radius) { // constructor
        this.mass = mass; // assigning values to the instance variables
        this.radius = radius;
    }

    public double getMass() { // getter methods to access the instance variables
        return mass;
    }

    public double getRadius() { // getter methods to access the instance variables
        return radius;
    }

}

// Usage from separate class
public class Exercise_01_question_02 { // main method in separate class

    public static void main(String[] args) {

        double earthMass = Planet.EARTH.getMass(); // calling the getter methods to access the instance variables
        System.out.println(earthMass);

    }

}