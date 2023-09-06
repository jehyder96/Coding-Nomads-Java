package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum+= numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The average of the numbers is: " + average);

        scanner.close();
    }

}