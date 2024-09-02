package Competitive_Coding;

import java.util.*;

//find common element between those arrays
public class Q6_CommonElementInArrays {
    public static void main(String[] args) {

        int array1[] = { 1, 2, 3, 4, 5, };
        int array2[] = { 4, 5, 6, 7, 8 };
        // consider non of those arrays contains dublicate element

        HashMap<Integer, Integer> numberCount = new HashMap<>();
        for (int i = 0; i < array1.length; i++) {
            numberCount.put(array1[i], numberCount.containsKey(array1[i]) ? numberCount.get(array1[i]) + 1 : 1);
        }
        for (int i = 0; i < array2.length; i++) {
            numberCount.put(array2[i], numberCount.containsKey(array2[i]) ? numberCount.get(array2[i]) + 1 : 1);
        }
        System.out.println("Common element between those arrays are : ");

        numberCount.forEach((k, v) -> {
            if (v > 1) {
                System.out.println(k);
            }
        });
    }
}
