package PracticeProblem;

import java.util.HashSet;

public class MagicMatrix {

    public int solution(int[][] matrix) {
        int n = matrix.length; // row
        int m = matrix[0].length; // column
        int downLength = 0;
        int rightLength = 0;
        int min = 0;
        int count = 0;
        if (m - n > 0) {
            rightLength = m - n;
            min = Math.min(m, n);
        } else {
            downLength = n - m;
            min = Math.min(m, n);
        }
        while (min != 0) {

            for (int d = 0; d <= downLength; d++) {
                for (int r = 0; r <= rightLength; r++) {
                    System.out.println("matrix no." + (count += 1));
                    HashSet<Integer> magic = new HashSet<>();

                    // Calculate row sum
                    for (int i = d; i < min + d; i++) {
                        int rowSum = 0;
                        for (int j = r; j < min + r; j++) {
                            rowSum += matrix[i][j];
                        }
                        System.out.println(rowSum);
                        magic.add(rowSum);
                    }

                    // Calculate column sum
                    for (int i = r; i < min + r; i++) {
                        int colSum = 0;
                        for (int j = d; j < min + d; j++) {
                            colSum += matrix[j][i];
                        }
                        System.out.println(colSum);
                        magic.add(colSum);
                    }

                    // calculate diagonal sum
                    int leftDiagonalSum = 0;
                    int rightDiagonalSum = 0;
                    for (int i = 0; i < min; i++) {

                        leftDiagonalSum += matrix[i + d][i + r];
                        rightDiagonalSum += matrix[i + d][(min + r) - (1 + i)];
                    }
                    System.out.println(leftDiagonalSum);
                    System.out.println(rightDiagonalSum);
                    magic.add(leftDiagonalSum);
                    magic.add(rightDiagonalSum);

                    // chack for matrix
                    if (magic.size() == 1) {
                        return min;
                    }

                }

            }
            downLength++;
            rightLength++;
            min--;
        }
        return 0;
    }

    public static void main(String[] args) {

        int[][] A = { { 4, 3, 4, 5, 3 }, { 2, 7, 3, 8, 4 }, { 1, 7, 6, 5, 2 }, { 8,
                4, 9, 5, 5 } };

        // int[][] A = { { 7, 2, 4 }, { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8, }, { 3, 5, 4
        // } };
        MagicMatrix solutionObj = new MagicMatrix();
        System.out.println(solutionObj.solution(A));
    }
}
