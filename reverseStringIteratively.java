public class reverseStringIteratively{
    public static void main(String[]args){
        reverseIteratively();
    }
    private static String reverseIteratively(){
        // reverse a string iteratively without built-in libraries
        String s = "abc";
        String reversedString = "";
        s.toCharArray();

        for(int i = s.length() - 1; i >= 0; i--){
            reversedString += s.charAt(i);
        }
        System.out.println(reversedString);
        return reversedString;
    }
}
