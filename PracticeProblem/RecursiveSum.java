package PracticeProblem;

public class RecursiveSum {

    /*
     * public static int sum(int[] arr, int i) {
     * if (i < 0) {
     * return 0;
     * }
     * return arr[i] + sum(arr, i - 1);
     * 
     * }
     */

    public static int sum(int[] arr, int i) {
        if (i > arr.length - 1) {
            return 0;
        }
        return arr[i] + sum(arr, i + 1);

    }

    public static void main(String[] args) {

        int num[] = { 5, 10, 15, 20 };
        /*
         * int add = 0;
         * int size = num.length;
         * System.out.println(sum(num, size - 1));
         */
        System.out.println(sum(num, 0));
    }
}