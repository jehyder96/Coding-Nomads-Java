package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5}; // array of 5 elements

        try {
            System.out.println(nums[5]); // trying to access 6th element
        } catch (ArrayIndexOutOfBoundsException exc) { // catching exception
            System.out.println("Array index out of bounds."); // printing error message
        }
}
}