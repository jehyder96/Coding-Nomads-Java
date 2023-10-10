package labs_examples.generics.labs;
import java.util.Collection;

public class generics_exercise_03 {
    // T extends Number means T can be any subclass of Number and V extends Number means V can be any subclass of Number
    // this allows T to be a more specific number type like: Integer, Double, Float, etc.
    public static <T extends Number, V extends Number> double sum(T num1, V num2) {

        return num1.doubleValue() + num2.doubleValue(); // return the sum of num1 and num2

    }

    // Generic method that counts the number of elements in a collection of strings that are palindromes
    // A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward, ignoring spaces, punctuation, and capitalization.
    // In other words, it is a sequence that remains unchanged when its characters are reversed.
    public static <T extends CharSequence> int countPalindromes(Collection<T> collection) {
            int palindromeCount = 0;

            for (CharSequence item : collection) { // for each item in the collection
                if (isPalindrome(item.toString())) { // if the item is a palindrome
                    palindromeCount++; // increment the palindrome count
                }
            }

            return palindromeCount;
    }

    private static boolean isPalindrome(String str) { // helper method to check if a string is a palindrome
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // remove all non-alphanumeric characters and convert to lowercase
        int left = 0; // left index
        int right = str.length() - 1; // right index (length - 1)

        while (left < right) { // while the left index is less than the right index
            if (str.charAt(left) != str.charAt(right)) { // if the character at the left index is not equal to the character at the right index
                return false; // return false
            }
            left++; // increment the left index
            right--; // decrement the right index
        }

        return true; // return true
    }

    public static void main(String[] args) {
        // Example usage with a Collection of Strings
        java.util.ArrayList<String> stringList = new java.util.ArrayList<>(); // create an ArrayList of Strings called stringList
        stringList.add("racecar");
        stringList.add("hello");
        stringList.add("level");

        // call countPalindromes() with stringList as the argument and assign the return value to palindromeCount
        int palindromeCount = countPalindromes(stringList);
        System.out.println("Number of palindromes: " + palindromeCount); // print the number of palindromes
    }
}


