package com.hackerrank.easy;

public class CompareTheTriplets {
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        int sumOfA = 0;
        int sumOfB = 0;

        if (a0 != b0) {
            if (a0 > b0) {
                sumOfA = sumOfA + 1;
            } else {
                sumOfB = sumOfB + 1;
            }
        }
        if (a1 != b1) {
            if (a1 > b1) {
                sumOfA = sumOfA + 1;
            } else {
                sumOfB = sumOfB + 1;
            }
        }
        if (a2 != b2) {
            if (a2 > b2) {
                sumOfA = sumOfA + 1;
            } else {
                sumOfB = sumOfB + 1;
            }
        }
        int arr[] = new int[]{sumOfA, sumOfB};
        return arr;
    }
}
