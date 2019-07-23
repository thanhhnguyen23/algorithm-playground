package datastructures.strings;

public class CharASCII {
    // character to ASCII
    public static void main(String[] args) {

//        Integer result = charToAscii('a');
        Integer result = charToAscii('A');
        System.out.println(result);
    }
    private static Integer charToAscii(char c){
        int ascii = (int) c;
        return ascii;
    }
}
