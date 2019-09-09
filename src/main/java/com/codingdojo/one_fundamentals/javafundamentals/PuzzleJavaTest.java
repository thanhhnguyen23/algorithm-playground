package com.codingdojo.one_fundamentals.javafundamentals;

import java.util.ArrayList;
import java.util.List;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava puzzleJava = new PuzzleJava();

//        puzzleJava.printSum();
//        puzzleJava.printGreaterThan10();
//        puzzleJava.longerThanFiveChars();
//        puzzleJava.displayLetter();
//        puzzleJava.randomNumbers();
//        puzzleJava.sortedRandomNumbers();
//        puzzleJava.generateRandomString();

        /* ● Generate an array with 10 random strings that are each 5 characters long
         */
        List<String> strList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
//            puzzleJava.generateRandomString();
            strList.add((puzzleJava.generateRandomString()));
        }
        System.out.println(strList);
    }
}
