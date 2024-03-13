package algo.common.patterns;

import java.util.Arrays;

/**
 * PrintDiagonalMatrix
 * https://www.geeksforgeeks.org/problems/print-matrix-in-diagonal-pattern/1
 */
public class PrintDiagonalMatrix {
    public static void main(String[] args) {
        int n = 3;
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // output : {1, 2, 4, 7, 5, 3, 6, 8, 9}
        printDiagonal(mat, n);
    }

    private static void printDiagonal(int[][] mat, int n) {
        int len = n * n;
        int ans[] = new int[len];
        int i = 0, j = 0, k = 0;
        int upper = 1;
        while (k < len) {
            if (upper == 1) {
                while (i >= 0 && j < n) {
                    ans[k++] = mat[i][j];
                    if (j == n - 1) {
                        i++;
                        break;
                    } else if (i == 0) {
                        j++;
                        break;
                    }

                    i--;
                    j++;
                }
                upper = 0;

            } else {
                while (i < n && j >= 0) {
                    ans[k++] = mat[i][j];
                    if (i == n - 1) {
                        j++;
                        break;
                    } else if (j == 0) {
                        i++;
                        break;
                    }
                    i++;
                    j--;
                }
                upper = 1;
            }
        }
        System.out.println(Arrays.toString(ans));
    }

}