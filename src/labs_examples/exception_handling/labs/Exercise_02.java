package labs_examples.exception_handling.labs;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

public class Exercise_02 {
    public static void main(String[] args) {

        // exception = 	an event that occurs during the execution of a program that,
        //				disrupts the normal flow of instructions

        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println("result: " + z);
        }
        catch(ArithmeticException e) { // catches divide by zero
            System.out.println("You can't divide by zero!");
        }
        catch(InputMismatchException e) { // catches non-integer input
            System.out.println("PLEASE ENTER A NUMBER!!!");
        }
        catch(Exception e) { // catches all other exceptions
            System.out.println("Something went wrong");
        }
        finally {
            scanner.close();
        }

    }
}

