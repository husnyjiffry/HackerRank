package com.hackerrank.easy;

public class Kangaroo {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        String result = "NO";
        for (int n = 0; n < 10000; n++) {
            if ((x1 + n * v1) == (x2 + n * v2)) {
                result = "YES";
            } else {
            }
        }
        return result;
    }
}
