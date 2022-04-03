package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {1.5, 2.0, 4.5, -3.0, 5.0, -9.3, 6.4, 5.4, -2.1, 1.0, 3.2, 4.3, -6.5, 8.7, -7.6};
        int digits = 0;
        double digit = 0;
        boolean negative = false;
        for (double num : numbers) {
            if (num < 0) {
                negative = true;
            } else if (negative) {
                digits++;
                digit += num;
            }
        }
        System.out.println(digit / digits);
    }
}
