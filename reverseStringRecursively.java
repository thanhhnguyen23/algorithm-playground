public class reverseStringRecursively{
    public static void main(String[]args){
        String myString = "abc";
        String reversed = reverseStringRecursively(myString);
        System.out.println(reversed);
    }
    private static String reverseStringRecursively(String str){
        /*
           1. function must calls itself
           2. progression attribute (decrement or increment)
           3. base case
         */
        if(str.isEmpty()) return str;
        return reverseStringRecursively(str.substring(1)) + str.charAt(0);
    }
}
