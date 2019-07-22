package com.hackerrank.easy;

public class AppleAndOrange {
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int ap = 0, org = 0;
        for (int i = 0; i < apples.length; i++) {
            int ds = a + apples[i];
            if (ds >= s && ds <= t) {
                ap += 1;
            }
        }

        for (int i = 0; i < oranges.length; i++) {
            int or = oranges[i] + b;
            if (or >= s && or <= t) {
                org += 1;
            }
        }

        System.out.println(ap);
        System.out.println(org);

    }
}
