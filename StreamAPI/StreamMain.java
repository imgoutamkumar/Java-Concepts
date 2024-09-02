package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(6);
        list1.add(5);
        list1.add(10);
        list1.add(7);

        System.out.println(list1);
        ArrayList<Integer> evenList1 = new ArrayList<>();

        // using for each loop to get the even element
        for (Integer i : list1) {
            if (i % 2 == 0) {
                evenList1.add(i);
            }
        }
        System.out.println(evenList1);
        System.out.println("-------------------------------------");

        // using for stream APIs to get the even element
        Stream<Integer> s1 = list1.stream();
        Stream<Integer> s2 = list1.stream();
        List<Integer> L1 = s1.filter(i -> i % 2 == 0).collect(Collectors.toList());
        ArrayList<Integer> newList = new ArrayList<>(L1);
        System.out.println(newList);
        System.out.println("-------------------------------------");

        // using for stream APIs to get element>6
        List<Integer> L2 = s2.filter(i -> i > 6).collect(Collectors.toList());
        System.out.println(L2);
    }
}
