package com.hackerrank.easy;

public class VeryBigSum {
    static long aVeryBigSum(int n, long[] ar) {
        long sum = 0L;
        for (int i = 0; i < n; i++) {
            sum = sum + ar[i];
        }
        return sum;
    }
}
