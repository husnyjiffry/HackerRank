package com.hackerrank.easy;

public class SimpleArraySum {
    static int simpleArraySum(int[] ar) {
        int sum = 0;
        for (Integer e : ar) {
            sum += e;
        }
        return sum;
    }
}