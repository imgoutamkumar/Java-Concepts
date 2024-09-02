package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        // *Blank Stream
        // Stream<Object> emptyStream = Stream.empty();

        String names[] = { "Karan", "Joy", "Nikita", "Jaychand", "Mohan" };

        System.out.println("---------------------------------");
        // method 2
        Stream<String> stream2 = Stream.of(names);
        stream2.forEach(e -> {
            System.out.println(e);
        });

        System.out.println("---------------------------------");
        // method 3
        IntStream stream3 = Arrays.stream(new int[] { 2, 3, 5, 4, 6 });
        stream3.forEach(e -> {
            System.out.println(e);
        });

        System.out.println("---------------------------------");
        // method 4
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(2);
        list4.add(3);
        list4.add(6);
        list4.add(5);
        list4.add(10);
        list4.add(7);

        Stream<Integer> stream4 = list4.stream();
        stream4.forEach(e -> {
            System.out.println(e);
        });

    }
}
