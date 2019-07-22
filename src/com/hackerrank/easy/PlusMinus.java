package com.hackerrank.easy;

public class PlusMinus {
    static void plusMinus(int[] arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int len = arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive += 1;
            } else if (arr[i] == 0) {
                zero += 1;
            } else {
                negative += 1;
            }
        }

        float pos = (float) positive / len;
        float neg = (float) negative / len;
        float ze = (float) zero / len;

        System.out.println(pos);
        System.out.println(neg);
        System.out.println(ze);
    }
}
