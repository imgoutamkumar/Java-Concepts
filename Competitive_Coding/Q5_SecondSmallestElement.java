package Competitive_Coding;

import java.util.*;

// find 2nd smallest element array in an array
public class Q5_SecondSmallestElement {
    public static void main(String[] args) {

        int number[] = { 3, 45, 2, 52, 100, 6, 11 };

        TreeSet<Integer> numbers = new TreeSet<>();

        for (int i = 0; i < number.length; i++) {
            numbers.add(number[i]);
        }
        int count = 0;
        for (Integer element : numbers) {
            count++;
            if (count == 2) {
                System.out.println("Second smallest element in number Array is : " + element);
                break;
            }
        }

    }
}
