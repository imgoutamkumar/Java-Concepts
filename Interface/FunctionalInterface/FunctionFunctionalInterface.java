package Interface.FunctionalInterface;

import java.util.function.Function;

//This functional interface represents a function that accepts one argument and produces a result.
//The input parameter type and the return type of the method can either be same or different.
public class FunctionFunctionalInterface {
    public static void main(String[] args) {
        int num = 7;
        Function<Integer, Integer> squareMe = (i) -> i * i;
        System.out.println("Square of number :" + squareMe.apply(num));
    }
}
