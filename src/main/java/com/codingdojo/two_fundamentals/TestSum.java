package com.codingdojo.two_fundamentals;

public class TestSum {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        /**
         * Object type example
         */
        Integer sum = 0; // 4.957 seconds

        /**
         * primitive type example
         */
        // int sum = 0; // 0.583 seconds

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        long end = System.currentTimeMillis();
        double total = (double) (end - start) / 1000;
        System.out.println("Time of execution: " + total + " seconds.");
    }

}