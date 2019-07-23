package datastructures.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {
    // find duplicate characters in given string
    // e.g. String s = "Java"; results: a

    public static void main(String[] args) {

        duplicateCharacter("Java");
    }

    /**
     * find all duplicate characters in a string and print each of them
     */
    private static void duplicateCharacter(String str) {

        char[] characters = str.toCharArray();

        // building HashMap with characters with number of times they appear in String
        Map<Character, Integer> charMap = new HashMap<>();

        for (Character ch : characters) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }
        /**
         * iterate through HashMap to print all duplicate characters of String
         */
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();

        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }

}
