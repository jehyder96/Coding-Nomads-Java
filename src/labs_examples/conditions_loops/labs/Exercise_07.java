package labs_examples.conditions_loops.labs;
import java.util.Scanner;  // Import the Scanner class

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //creating the scanner
        System.out.println("Enter any word to see if there is a vowel in it.");
        String userWord = scanner.nextLine();  // Read user input
        String vowels = "aeiou"; //creating a string of vowels
        int i = 0; //creating a counter
        while(i < userWord.length()){ //while loop to check if the word has a vowel
            if(vowels.indexOf(userWord.charAt(i)) != -1){ //if statement to check if the word has a vowel
                System.out.println("The first vowel in the word " + userWord + " is " + userWord.charAt(i));
                break; //breaks the loop
            }
            i++; //increments the counter


        }
    }
}
