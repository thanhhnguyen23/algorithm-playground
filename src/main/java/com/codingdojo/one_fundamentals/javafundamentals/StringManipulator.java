public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        str1 = str1.trim();
        System.out.println("str1: " + str1);

        str2 = str2.trim();
        System.out.println("str2: " + str2);

        return str1 + str2;
    }
    //---------------------------------------------------------------------------------

    public Integer getIndexOrNull(String str, char c) {
        if (str.length() == 0 && str.indexOf(c) == -1) {
            return null;
        } 
        else {
            if (str.indexOf(c) == -1){
                return null;
            }
            return str.indexOf(c);
        }
    }

    //---------------------------------------------------------------------------------

    public String concatSubstring(String str1, Integer int1, Integer int2, String str2){
        // System.out.println(str1.substring(int1, int2) + str2);
        return str1.substring(int1, int2) + str2;
    }

}