package com.hackerrank.easy;

public class Staircase {
    static void staircase(int a) {
        if (0 < a) {
            if (a <= 100) {
                for (int i = 1; i <= a; i++) {
                    for (int j = 0; j < a; j++) {
                        if ((a - j) > i) {
                            System.out.print(" ");
                        } else {
                            System.out.print("#");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}
