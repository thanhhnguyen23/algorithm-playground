package com.codingdojo.one_fundamentals.javafundamentals;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

public class BasicJava {

    /**
     * print numbers from 0 - 255
     */
    public void print1() {
        for (int i = 0; i < 256; i++) {
            System.out.println(i);
        }
    }

    /**
     * print odd numbers from 0 - 255
     */
    public void print2() {
        for (int i = 0; i < 256; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * print sum from 0 - 255
     */
    public void print3() {
        int sum = 0;
        for (int i = 0; i < 256; i++) {
            System.out.println(i + sum);
            sum += i;
        }

    }

    /**
     * iterate through an array
     */

    public void print4() {
        /**
         * given array X --> [1,3,5,7,9,13] iterate through array
         */
        Integer[] X = {1, 3, 5, 7, 9, 13};
        for (Integer element : X) {
            System.out.println(element);
        }
    }

    /**
     * find max > should work with negative numbers > mix (positive/negative
     * numbers) > including zero
     */
    public void print5() {
        Integer[] array = {1, 3, 5, 7, 9, 13};
        // Integer[] array = {-1,-3,-5,-7,-9,-13, 0, 3};
        Integer max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    /**
     * get average
     */
    public void print6() {
        Integer[] array = {2, 10, 3}; // average: 5
        Integer sum = array[0];

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.println("sum: " + sum);
        }
        double average = (sum / array.length);

        System.out.println(average);
    }

    /**
     * array with odd numbers
     */
    public void print7() {

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < 256; i++) {
            if (i % 2 != 0) {
                array.add(i);
            }
        }
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }

    /**
     * greater than y > array = [1,3,5,7] > y -> 3
     * <p>
     * > return 2 > there are 2 values in the array that are greater than 3
     */

    public Integer print8() {

        Integer[] array = {1, 3, 5, 7};
        Integer y = array[1];
        Integer counter = 0;

        // System.out.println("y: " + y);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > y) {
                counter++;
            }
        }
        System.out.println("There are " + counter + " values that are greater than " + y + ".");
        return counter;
    }

    /**
     * square the values
     */
    public ArrayList<Integer> print9() {
        ArrayList<Integer> y = new ArrayList<>();
        ArrayList<Integer> x = new ArrayList<>();

        x.add(1);
        x.add(5);
        x.add(10);
        x.add(-2);

        for (int i : x) {
            // System.out.println(i*i);
            y.add(i * i);
        }

        for (int i : y) {
            System.out.println(i);
        }
        return y;
    }

    /**
     * eliminate negative numbers > given array x -> [1,5,10,-2] > replace any
     * negative numbers with zero
     */
    public ArrayList<Integer> print10() {
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        ArrayList<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(5);
        x.add(10);
        x.add(-2);

        for (Integer i : x) {
            if (i > 0) {
                positiveNumbers.add(i);
            }
        }
        System.out.println(positiveNumbers);
        return positiveNumbers;
    }

    /**
     * min, max, average
     */

    public List<Integer> print11() {
        /**
         * Given any array x, say [1, 5, 10, -2]
         * write a method that returns an array with the maximum number in the array,
         * the minimum value in the array, and the average of the values in the array.
         * The returned array should be three elements long and contain: [MAXNUM, MINNUM, AVG]
         */

        List<Integer> result = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        result.add(1);
        result.add(5);
        result.add(10);
        result.add(-2);

        int max = result.get(0);
        int min = result.get(0);
        int avg = result.get(0);
        int sum = result.get(0);

        for(int i = 1; i < result.size(); i++){
            if(result.get(i) > max) {
                max = result.get(i);
            }
            if(result.get(i) < min){
                min = result.get(i);
            }
            sum += result.get(i);
        }
        avg = sum / result.size();

        output.add(max);
        output.add(min);
        output.add(avg);

        System.out.println(output);
        return output;
    }

    /**
     * shifting values in an array
     */
    public List<Integer> print12() {
        /**
         * Given any array x, say [1, 5, 10, 7, -2],
         * write a method that shifts each number by one to the front.
         * For example, when the method is done, an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0].
         * Notice that the last number is 0. The method does not need to wrap around the values shifted out of bounds.
         */
        int[] array = new int[]{1, 5, 10, 7, -2};
        List<Integer> output = new ArrayList<>();

        for(int i = 1; i < array.length; i++){
            output.add(array[i]);
        }
        if(!output.isEmpty()){
            output.add(0);
        }
        System.out.println("output: " + output);
        return output;
    }
}
