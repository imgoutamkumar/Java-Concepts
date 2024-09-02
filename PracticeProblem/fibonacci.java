package PracticeProblem;

import java.util.*;

public class fibonacci {
    int n;

    public int fibArray(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibArray(n - 1) + fibArray(n - 2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        fibonacci f = new fibonacci();

        System.out.println("enter value of n : ");
        f.n = input.nextInt();
        input.close();

        System.out.println(f.n + "th " + "element of fibonacci series is : " + f.fibArray(f.n));

    }
}
