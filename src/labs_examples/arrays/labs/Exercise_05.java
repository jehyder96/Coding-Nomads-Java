package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7}; // creating the array
        for (int i = array.length - 1; i >= 0; i-=2) { // creating the for loop to go through every other element in reverse order
            System.out.println(array[i]); // printing the array
        }
    }

}
