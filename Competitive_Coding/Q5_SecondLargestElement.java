package Competitive_Coding;

public class Q5_SecondLargestElement {
    public static void main(String[] args) {

        int num[] = { 40, 2, 80, 11, 27, 55, 74 };
        int temp;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("second largest element in that array is :" + num[num.length - 2]);
    }
}
