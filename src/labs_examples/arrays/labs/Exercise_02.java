package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: "); //creating scanner
        int num = scanner.nextInt(); //assigning user input to num
        for(int i = 0; i < array.length; i++) { //looping through array
            if(array[i] == num) { //if the array index is equal to the user input
                System.out.println("The index of " + num + " is " + i); //print the index
            }
        }
        scanner.close(); //close scanner
    }
}