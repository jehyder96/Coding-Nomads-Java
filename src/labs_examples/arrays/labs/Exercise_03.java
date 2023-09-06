package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int[][] array = new int[5][5]; //creating 2d array
        int num = 3; //starting number
        for(int i = 0; i < array.length; i++) { //looping through rows
            for(int j = 0; j < array[i].length; j++) { //looping through columns
                array[i][j] = num; //assigning num to array index
                num += 3; //incrementing num by 3
            }
        }
        for(int i = 0; i < array.length; i++) { //looping through rows
            for(int j = 0; j < array[i].length; j++) { //looping through columns
                System.out.print(array[i][j] + " "); //printing array index
            }
            System.out.println(); //printing new line
        }
        
    }
}
