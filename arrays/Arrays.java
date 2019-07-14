import java.util.ArrayList;
import java.util.List;

public class Arrays{
  public static void main(String[]args){
    List<String> strings = new ArrayList<>();

    strings.add("a"); // O(1)
    strings.add("b");
    strings.add("c");
    strings.add("d");
    strings.add("e");
    strings.add("f");
    
    for (String s : strings) {
      System.out.println(s);
    }
  }
}
