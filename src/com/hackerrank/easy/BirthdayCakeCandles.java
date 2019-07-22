package com.hackerrank.easy;

public class BirthdayCakeCandles {
    static int birthdayCakeCandles(int[] ar) {

        int max = ar[1];
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        for (int j = 0; j < ar.length; j++) {
            if (ar[j] == max) {
                count += 1;
            }
        }
        return count;
    }
}
