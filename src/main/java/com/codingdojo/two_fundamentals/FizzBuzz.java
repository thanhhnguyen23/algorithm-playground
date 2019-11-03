package com.codingdojo.two_fundamentals;

public class FizzBuzz {
    public String fizzBuzz(int number) {
        /**
         * if 3 --> output 
         * Fizz if 5 --> output 
         * Buzz if 15 --> output FizzBuzz
         */
        if (number % 15 == 0) {
            // System.out.println("FizzBuzz!");
            return "FizzBuzz";
        }
        else if (number % 5 == 0) {
            // System.out.println("Buzz!");
            return "Buzz";
        } else if (number % 3 == 0) {
            // System.out.println("Fizz!");
            return "Fizz";
        } else {
            // System.out.println("** else **");
            return "-1";
        }

    }


}