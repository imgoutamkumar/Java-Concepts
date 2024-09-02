package Competitive_Coding;

//Reversing array without using another array
public class Q7_ReversingArray {
    public static void main(String[] args) {

        int numbers[] = { 1, 2, 3, 4, 5 };
        for (int index = 0; index < numbers.length / 2; index++) {
            int temp = numbers[index];
            numbers[index] = numbers[numbers.length - (index + 1)];
            numbers[numbers.length - (index + 1)] = temp;
        }
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }
    }
}
