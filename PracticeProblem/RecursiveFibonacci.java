package PracticeProblem;

public class RecursiveFibonacci {

    int num = 7;
    int arr[] = new int[num + 1];

    public int[] fibArray(int n, int i) {

        if (i > n) {
            arr[0] = 0;
            arr[1] = 1;
            return arr;
        }
        arr[i] = arr[i - 2] + arr[i - 1];
        return fibArray(n, i + 1);
    }

    public static void main(String[] args) {
        RecursiveFibonacci f = new RecursiveFibonacci();

        System.out.println(f.fibArray(f.num, 2));
        for (int e : f.fibArray(f.num, 2)) {
            System.out.println(e);
        }

    }
}
