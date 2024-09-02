package Interface.FunctionalInterface;

import java.util.function.Predicate;

// The Predicate is a functional interface defined in java. util. Function package, which accepts one argument and returns a boolean.
//  This is mainly used to filter data from a Java Stream. The filter method of a stream accepts a predicate to filter the data and returns a new stream satisfying the predicate.

public class PredicateFunctionalInterface {
    public static void main(String[] args) {
        Predicate<String> checkLength = (s) -> s.length() >= 5;
        Predicate<String> checkEvenLength = (s) -> s.length() % 2 == 0;
        System.out.println("length of the string is grater then 5 :" + checkLength.test("Hello World"));

        // predicate joining
        System.out.println("Using and :" + checkLength.and(checkEvenLength).test("Hello World"));
        System.out.println("Using or :" + checkLength.or(checkEvenLength).test("Hello World"));
        System.out.println("Using negate :" + checkLength.negate().test("Hello World"));

    }
}
