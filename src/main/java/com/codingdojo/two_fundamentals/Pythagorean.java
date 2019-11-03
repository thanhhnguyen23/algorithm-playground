package com.codingdojo.two_fundamentals;

public class Pythagorean {

    public double calculateHypotenuse ( int legA, int legB) {

        double result = Math.sqrt((Math.pow(legA, 2) + Math.pow(legB, 2)));
//        System.out.println("hypotenuse: " + result);

        return result;
    }
}
