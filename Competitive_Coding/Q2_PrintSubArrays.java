package Competitive_Coding;

//print sub arrays of targeted sum
public class Q2_PrintSubArrays {
    public static void main(String[] args) {
        int number[] = { 2, 1, 4, 5, 6, 3 };

        int targetvalue = 8;
        int subArray[];

        for (int i = 0; i < number.length; i++) {
            int sum = 0;
            for (int j = i; j < number.length; j++) {
                sum = sum + number[j];
                if (sum < targetvalue) {
                    j++;
                } else if (sum == targetvalue) {

                } else {
                    System.out.println("Sub Arrays doesn't exist");
                }
            }
        }
    }
}
