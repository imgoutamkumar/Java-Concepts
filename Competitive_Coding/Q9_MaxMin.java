package Competitive_Coding;

//find min, max, second max and second min
public class Q9_MaxMin {

    public static void main(String[] args) {
        int num[] = { 2, 2, 2, 3, 3, 58, 14, 6, 5, 17 };

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secMax = Integer.MIN_VALUE;
        int secMin = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }

        for (int i = 0; i < num.length; i++) {

            if (num[i] > secMax && num[i] < max) {
                secMax = num[i];
            }
            if (num[i] < secMin && num[i] > min) {
                secMin = num[i];
            }
        }

        System.out.println("max = " + max + " min = " + min);
        System.out.println("secMax = " + secMax + " secMin =" + secMin);

    }
}
