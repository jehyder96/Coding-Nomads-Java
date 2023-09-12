package labs_examples.objects_classes_methods.labs.methods;

public class MethodTraining {
    // 1) Demonstrate method overloading in this class
    public static void print(String s) {
        System.out.println(s);
    }

    public static void print(int i) {
        System.out.println(i);
    }

    public static void print(double d) {
        System.out.println(d);
    }
    public static void main(String[] args) { // Java knows which version of print() to use based on the argument type
        print("Hello");

        print(5);

        print(5.5);
    }

    // 2) Demonstrate the difference between "pass by value" and "pass by reference"
    // Pass by value
    public static void passByValue(int i) { // Java makes a copy of the value of i and passes it to the method
        i = 10;
    }
    // Pass by reference
    public static void passByReference(int[] arr) { // Java passes the reference to the array to the method
        arr[0] = 10;
    }
    // 3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
    public static int largestOfFour(int a, int b, int c, int d) { // Java passes the value of the arguments to the method
        int largest = a; // Assume a is the largest
        if (b > largest) { // If b is larger than a, then b is the largest
            largest = b; // Set largest to b
        }
        if (c > largest) { // If c is larger than the current largest, then c is the largest
            largest = c; // Set largest to c
        }
        if (d > largest) { // If d is larger than the current largest, then d is the largest
            largest = d; // Set largest to d
        }
        return largest; // Return the largest number
    }

    // 4) Write a method to count all consonants (the opposite of vowels) in a String
    public static int countConsonants(String s) { // Java passes the value of the argument to the method
        int count = 0; // Initialize count to 0 (this will be the number of consonants)
        for (int i = 0; i < s.length(); i++) { // Loop through each character in the string (s)
            char c = s.charAt(i); // Get the character at index i in the string
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') { // If the character is not a vowel (a, e, i, o, u)
                count++; // Increment count by 1
            }
        }
        return count; // Return the count of consonants
    }

    // 5) Write a method that will determine whether or not a number is prime
    public static boolean isPrime(int n) { // Java passes the value of the argument to the method
        if (n <= 1) { // If n is less than or equal to 1, then n is not prime
            return false;
        }
        for (int i = 2; i < n; i++) { // Loop through each number from 2 to n - 1
            if (n % i == 0) { // If n is divisible by i, then n is not prime
                return false;
            }
        }
        return true; // If n is not divisible by any number from 2 to n - 1, then n is prime
    }

    /* 6) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
     which is passed in as an argument */


    // 7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.

    // 8) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot



}
