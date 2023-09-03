package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 6: Basic while loop
 *
 *      Use a "while" loop find the sum of numbers to from 1-100. Print the sum to the console
 *
 */

public class Exercise_06 {
    public static void main(String[] args) {
        int x = 1; // initialize x to 1
        int sum = 0; // initialize sum to 0
        while(x <= 100){ // while x is less than or equal to 100
            sum += x; // add x to sum
            x++; // increment x
        }
        System.out.println("The sum from 1 to 100 is: " + sum);
    }
}
