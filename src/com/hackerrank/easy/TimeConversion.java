package com.hackerrank.easy;

public class TimeConversion {
    static String timeConversion(String s) {
        StringBuilder str = new StringBuilder(s);
        String noon = str.substring(s.length() - 2, s.length());
        if (noon.equals("AM")) {
            String hours = str.substring(0, 2);
            if (!hours.equals("12")) {
                str.replace(s.length() - 2, s.length(), "");
            } else {
                str.replace(0, 2, "00");
                str.replace(str.length() - 2, str.length(), "");
            }

        } else if (noon.equals("PM")) {
            String hours = str.substring(0, 2);
            if (!hours.equals("12")) {
                int hoursInInt = Integer.parseInt(hours) + 12;
                String h = String.valueOf(hoursInInt);
                str.replace(0, 2, h);
                str.replace(str.length() - 2, str.length(), "");
            } else {
                str.replace(s.length() - 2, s.length(), "");
            }
        }
        return str.toString();
    }
}
