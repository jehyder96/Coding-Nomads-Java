package labs_examples.generics.labs;

public class generics_exercise_01<T> {

    // T is a placeholder for the data type that will be passed in when the class is instantiated
    private T variable1; // declare variable1. private means it can only be accessed by this class
    private T variable2; // declare variable2

    public generics_exercise_01(T variable1, T variable2) {
        this.variable1 = variable1; // set the value of variable1
        this.variable2 = variable2; // set the value of variable2
    }

    public T getVariable1() {
        return variable1; // return the value of variable1
    }

    public T getVariable2() {
        return variable2; // return the value of variable2
    }

    public void setVariable1(T variable1) {
        this.variable1 = variable1; // set the value of variable1
    }

    public static void main(String[] args) {
        // creating an instance of generics_exercise_01 with String data type
        generics_exercise_01<String> stringInstance = new generics_exercise_01<>("Hello", "World");
        System.out.println("String instance: " + stringInstance.getVariable1() + " " + stringInstance.getVariable2());

        // creating an instance of generics_exercise_01 with Integer data type
        generics_exercise_01<Integer> integerInstance = new generics_exercise_01<>(1, 2);
        System.out.println("Integer instance: " + integerInstance.getVariable1() + " " + integerInstance.getVariable2());

        // creating an instance of generics_exercise_01 with Double data type
        generics_exercise_01<Double> doubleInstance = new generics_exercise_01<>(1.1, 2.2);
        System.out.println("Double instance: " + doubleInstance.getVariable1() + " " + doubleInstance.getVariable2());
    }
}
