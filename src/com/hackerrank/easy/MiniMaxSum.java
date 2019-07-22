package com.hackerrank.easy;

public class MiniMaxSum {
    static void miniMaxSum(int[] arr) {
        int min = arr[1], max = arr[1];
        long total = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }

            total += arr[i];
        }

        System.out.println((total - max) + " " + (total - min));
    }
}
