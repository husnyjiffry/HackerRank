package com.hackerrank.easy;

public class GradingStudents {
    static int[] gradingStudents(int[] grades) {
        int[] rounded = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 38) {
                int nextMultipleOfFive = (5 * ((grades[i] / 5) + 1));
                int diff = nextMultipleOfFive - grades[i];
                if (diff < 3) {
                    rounded[i] = nextMultipleOfFive;
                } else {
                    rounded[i] = grades[i];
                }
            } else {
                rounded[i] = grades[i];
            }
        }
        return rounded;
    }
}
