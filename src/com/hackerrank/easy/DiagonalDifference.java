package com.hackerrank.easy;

public class DiagonalDifference {
    static int diagonalDifference(int[][] a) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    sum1 = sum1 + a[i][j];
                }
            }
        }

        int counter1 = 0;
        int counter2 = a.length - 1;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == counter1 && j == counter2) {
                    sum2 = sum2 + a[counter1][counter2];
                    counter1++;
                    counter2--;
                }
            }
        }
        return Math.abs(sum1 - sum2);
    }
}
