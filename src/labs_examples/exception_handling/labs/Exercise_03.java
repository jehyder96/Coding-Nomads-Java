package labs_examples.exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
public class Exercise_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x/y;

            // Check for divide by zero
            if(y == 0) {
                throw new ArithmeticException("Divide by 0");
            }

            System.out.println("result: " + z);
        }

        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        catch(NumberFormatException e) { // catches non-integer input
            System.out.println("Only enter a number!!!");
        }

        catch(Exception e) { // catches all other exceptions
            System.out.println("Something went wrong. Check your input to make sure it's a whole number.");
        }

        finally {
            scanner.close();
        }
    }
}
