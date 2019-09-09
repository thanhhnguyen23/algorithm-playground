package com.codingdojo.one_fundamentals.javafundamentals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PuzzleJava {
    /*
     * ● Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array.
     * Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above,
     * it should return an array with the values of 13,25,32)
     */
    List<Integer> intArray = new ArrayList<Integer>(Arrays.asList(3, 5, 1, 2, 7, 9, 8, 13, 25, 32));

    public void printSum() {

        int sum = 0;

        for(int i = 0; i < intArray.size(); i++){
            sum += intArray.get(i);
        }
        System.out.println("sum: " + sum);

    }
    public void printGreaterThan10(){

        List<Integer> greaterThan10 = new ArrayList<>();

        for(int i = 0; i < intArray.size(); i++){
            if (intArray.get(i) > 10) {
                greaterThan10.add(intArray.get(i));
            }
        }

        System.out.println(greaterThan10);

    }

    /*
     * ● Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa.
     * Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than
     * 5 characters.
     */

    public List<String> longerThanFiveChars(){
        List<String> strArr = new ArrayList<String>(Arrays.asList("Jinichi", "Fujibayashi", "Momochi", "Ishikawa"));

        Collections.shuffle(strArr);

        for(String e : strArr){
            if(e.length() > 5){
                System.out.println(e);
            }
        }

        return strArr;
    }
    /*
     * ● Create an array that contains all 26 letters of the alphabet (this array must have 26 values).
     * Shuffle the array and, after shuffling, display the last letter from the array. Have it also display the first letter of the array.
     * If the first letter in the array is a vowel, have it display a message.
     */
    public void displayLetter(){
//        String[] letters = new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] letters = new String[] {"a", "e", "x", "y"};

        Collections.shuffle(Arrays.asList(letters));
        String[] vowels = new String[] {"a", "e", "i", "o", "u"};

        // prints stream
//        Arrays.stream(letters).forEach(letter -> System.out.println(letter));
        System.out.println("looking for vowels...\n");

        /*
         * display last letter from the array
         */

//        System.out.println((Arrays.stream(letters)
//                .reduce((a,b) -> b)
//                .orElse(null)
//        ));

        /*
         * only display last letter from the array if letter is a vowel
         */

        System.out.println("Looking for first letter in array that's a vowel");
        System.out.println((Arrays.stream(letters)
                .reduce((a,b) -> b)
                .filter(b -> b.charAt(0) == 'a'
                        || b.charAt(0) == 'e'
                        || b.charAt(0) == 'i'
                        || b.charAt(0) == 'o'
                        || b.charAt(0) == 'u')
                .orElse("null")
        ));

        /*
         * display first letter from the array
         */
//        System.out.println((Arrays.stream(letters).reduce((a,b) -> a).orElse(null)));

        /*
         * only display last letter from the array if letter is a vowel
         */
//        System.out.println("Looking for last letter in array that's a vowel");
//        System.out.println((Arrays.stream(letters)
//                .reduce((a,b) -> a)
//                .filter(a -> a.charAt(0) == 'a'
//                        || a.charAt(0) == 'e'
//                        || a.charAt(0) == 'i'
//                        || a.charAt(0) == 'o'
//                        || a.charAt(0) == 'u')
//                .orElse("null")
//        ));
    }


    /*
     * To shuffle a collection, you can use the shuffle method of the Collections class. Collections Class documentation
     * ● Generate and return an array with 10 random numbers between 55-100.
     */

    /* To get a random integer, you can use the nextInt method of the Random class. Random Class documentation
     * ● Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
     *
     * To sort a collection, you can use the sort method of the Collections class.
     * ● Create a random string that is 5 characters long.
     *
     * ● Generate an array with 10 random strings that are each 5 characters long
     */
}
