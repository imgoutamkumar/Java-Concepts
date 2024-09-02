package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Nitesh", "Aniket", "Pooja", "Shalini");

        // filter names start with specific character and here filter usees predicate
        List<String> L1 = names.stream().filter(x -> x.startsWith("A")).collect(Collectors.toList());
        System.out.println(L1);
        System.out.println("-------------------------------------");

        List<Integer> numbers = Arrays.asList(2, 3, 5, 6, 4);

        // return the array list after some modification or transformation and here map
        // uses function functional interface
        List<Integer> L2 = numbers.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(L2);
        System.out.println("-------------------------------------");
        // find maximum element using stream
        // int max = numbers.stream().max(Comparator.naturalOrder()).get();

        // find the sum of all numbers in a list using stream

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        System.out.println("-------------------------------------");

        // convert the list of string into its uppercase
        List<String> UppercaseList = names.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        System.out.println(UppercaseList);
        System.out.println("-------------------------------------");

        // filter even number using stream
        List<Integer> evenNumbers = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);
        System.out.println("-------------------------------------");

        // count the numbers that satisfy specific condition using stream
        long count = numbers.stream().filter(x -> x % 2 == 1).count();
        System.out.println(count);
        System.out.println("-------------------------------------");

        // remove duplicate emelement from list
        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctNumbers);
        System.out.println("-------------------------------------");

        // check all the elements in a list satisfy the given condition or not using
        // stream
        boolean iseven = numbers.stream().allMatch(x -> x % 2 == 0);
        System.out.println(iseven);
        System.out.println("-------------------------------------");

        boolean isLessThenTen = numbers.stream().allMatch(x -> x < 10);
        System.out.println(isLessThenTen);
        System.out.println("-------------------------------------");

    }
}
