package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a separate class.
 *      2) Create a parameterized enumeration that passes one or more values to its constructor. Demonstrate the use
 *      of this enum from a separate class.
 */
enum Season { // enum is a special type of class that contains a fixed set of constants (static final variables)
    SPRING, SUMMER, FALL, WINTER // constant, meaning they cannot change
}

// controller class
class Controller {
    public static void main(String[] args) {
        Season season = Season.SPRING; // creating an instance of the enum, assigning it to a variable called season of type Season
        switch (season) {
            case SUMMER: // using the enum in a switch statement
                System.out.println("It's summer!");
                break; // break statement is optional but recommended to prevent fall-through
            case SPRING:
                System.out.println("It's spring!");
                break;
            case FALL:
                System.out.println("It's fall!");
                break;
            case WINTER: //
                System.out.println("It's winter!");
                break;
            default: // default case is optional but recommended to catch any unexpected values that may be passed in
                throw new IllegalStateException("Unexpected value: " + season);
        }
    }
}
