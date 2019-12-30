package com.thanhhnguyen23.algorithms;

public class IsPalindrome {
    private String userInput = null;

    public String getUserInput() {
        return this.userInput;
    }

    public String setUserInput(String userInput) {
        return this.userInput = userInput;
    }

    public String verify(StringBuilder userInput) {
        StringBuilder original = new StringBuilder(userInput);
        return original.reverse().toString();
    }

}
