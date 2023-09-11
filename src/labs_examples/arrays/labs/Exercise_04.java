package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] twoD = new int[3][3]; // creating the two-dimensional array
        for (int i = 0; i < twoD.length; i++){ // creating the four loop
            for (int j = 0; j < twoD[i].length; j++) { // creating the nested for loop
                twoD[i][j] = i * j; // assigning the value of i * j to the array
                System.out.print(twoD[i][j] + " - "); // printing the array
            }
            System.out.println(); // printing a new line
        }
    }

}
