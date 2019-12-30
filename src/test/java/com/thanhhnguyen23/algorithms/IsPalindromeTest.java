package com.thanhhnguyen23.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsPalindromeTest {

    @Test
    public void whenUserInputIsPalindromeReturnMatchingPalindrome(){
        IsPalindrome isPalindrome = new IsPalindrome();
        isPalindrome.setUserInput("abccda");
        StringBuilder sb = new StringBuilder(isPalindrome.getUserInput());
        String actual = isPalindrome.verify(sb);
        String expected = "adccba";
        assertEquals(expected, actual);
    }

    @Test
    public void whenUserInputIsEmpty() {
        IsPalindrome isPalindrome = new IsPalindrome();
        isPalindrome.setUserInput("");
        String expected = "";
        String actual = isPalindrome.getUserInput();
        assertEquals(expected.length(), actual.length());
    }

    @Test
    public void whenUserInputIsOneCharacter() {
        IsPalindrome isPalindrome = new IsPalindrome();
        isPalindrome.setUserInput("b");
        String expected = "a";
        String actual = isPalindrome.getUserInput();
        assertEquals(expected.length(), actual.length());
    }

}