package datastructures.strings;

public class ReplaceSpaces {
    public static void main(String[] args) {

        String result = replaceSpaces("this is a string!");
        System.out.println(result);
    }

    // write a method that replaces all spaces in given string with %20
    private static String replaceSpaces(String str) {
//  example 1
        String result = str.replace(" ", "%20");
//  example 2
//  String result = str.replaceAll("\\s", "%20");
        return result;
    }
}
