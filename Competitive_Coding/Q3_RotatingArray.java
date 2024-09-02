package Competitive_Coding;

public class Q3_RotatingArray {
    public static void main(String[] args) {

        // input = [4,5,7,11,-2]
        // output = [7,11,-2,4,5]

        int moves = 2;

        int number[] = { 4, 5, 7, 11, -2 };
        for (int i = 0; i < moves; i++) {
            int hold = number[0];
            for (int j = 0; j < number.length - 1; j++) {
                number[j] = number[j + 1];
            }
            number[number.length - 1] = hold;
        }

        for (int j = 0; j < number.length; j++) {
            System.out.println(number[j]);
        }
    }
}
