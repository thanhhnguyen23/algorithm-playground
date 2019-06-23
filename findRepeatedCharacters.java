import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class findRepeatedCharacters{
  /*
   * find duplicate characters in a String
   */
  public static void main(String[]args){
    // printDuplicateChars("Thanh"); // returns h : 2
    printDuplicateChars("abcc"); // returns c : 2

  }

  private static void printDuplicateChars(String word){
    char[] characters = word.toCharArray();

    // builds HashMap with character and number of times they appear in String
    Map<Character, Integer> charMap = new HashMap<>();
    for(Character ch : characters){
      if(charMap.containsKey(ch)){
        charMap.put(ch, charMap.get(ch) + 1);
      } else{
        charMap.put(ch, 1);
      }
    }

    // iterate through HashMap to print all duplicate characters within String
    Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
    System.out.printf("List of duplicate characters in String '%s'%n", word);
      for(Map.Entry<Character, Integer> entry : entrySet){
        if(entry.getValue() > 1){
          System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
        }
      }
  }
}
