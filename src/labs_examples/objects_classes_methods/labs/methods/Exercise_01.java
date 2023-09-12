package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b) { // return type is int
        return a * b; // return the product of a and b
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static double divide(int a, int b) { // return type is double to account for decimal values
        return (double) a / b; // cast a to double to account for decimal values
    }


    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke(){ // return type is void because we are not returning anything
        System.out.println("What's funnier than 24? 25!"); // print the joke
    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static long yearsToSeconds(int years) { // return type is long to account for large numbers
        int days = years * 365; // Convert years to days
        long seconds = days * 24 * 60 * 60; // convert days to seconds directly
        return seconds; // return the number of seconds
    }
    // long totalSecs = yearsToSeconds(4); use this to call the method


    // 5) Create a varargs method that will return the length of the varargs array passed in

    public static int varargsLength(String... args) { // varargs must be the last parameter
        return args.length; // return the length of the varargs array
    }






}
