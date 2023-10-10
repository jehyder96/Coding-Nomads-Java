package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */
import java.util.ArrayList;

class Demo {

    public static <T extends Number> double calculateSum(ArrayList<T> list) { // T extends Number means T can be any subclass of Number

        double sum = 0.0;

        for(T number : list) { // for each number in the list
            sum += number.doubleValue(); // add the number to the sum
        }

        return sum; // return the sum of all numbers in the list

    }

    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>(); // create an ArrayList of Integers called intList
        intList.add(1); // add 1 to intList
        intList.add(2); // add 2 to intList
        intList.add(3); // add 3 to intList
        // there are 3 elements in intList totaling 6 when added together

        double intSum = calculateSum(intList); // call calculateSum() with intList as the argument and assign the return value to intSum
        System.out.println("Sum of intList: " + intSum); // print the sum of intList

        ArrayList<Double> doubleList = new ArrayList<>(); // create an ArrayList of Doubles called doubleList and add 1.1, 2.2, and 3.3
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);
        // there are 3 elements in doubleList totaling 6.6 when added together

        double doubleSum = calculateSum(doubleList); // call calculateSum() with doubleList as the argument and assign the return value to doubleSum
        System.out.println("Sum of doubleList: " + doubleSum); // print the sum of doubleList

    }

}