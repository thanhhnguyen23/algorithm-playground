package strings;

public class LengthRecursively {
    public static void main(String[] args) {

        Integer result = length("hello");
        System.out.println(result);
    }
    private static Integer length(String str){
        if(str.length() < 1){
            return str.length();
        }
        else{
            return length(str.substring(1)) + 1;
        }
    }
}
