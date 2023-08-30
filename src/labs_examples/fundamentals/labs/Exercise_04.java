package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below
        boolean isEmpty = false;
        System.out.println("boolean isEmpty is: " + isEmpty);
        char letter = 'a';
        System.out.println("char letter is: " + letter);
        byte b = 127;
        System.out.println("byte b is: " + b);
        short s = 32767;
        System.out.println("short s is: " + s);
        int intVal = 2147483647;
        System.out.println("int intVal is: " + intVal);
        long longVal = 9223372036854775807L;
        System.out.println("long longVal is: " + longVal);
        float floatVal = 340282346638528860000000000000000000000.0f;
        System.out.println("float floatVal is: " + floatVal);
        double doubleVal = 179.27;
        System.out.println("double doubleVal is: " + doubleVal);

        System.out.println("The largest value a byte can hold is: " + Byte.MAX_VALUE);

    }

}
