package datastructures.strings;

public class reverseStringWithStringBuilder{
	public static void main(String[]args){
    // reverse string with StringBuilder
    String s = "abc";
    StringBuilder sb = new StringBuilder(s);

    sb.reverse();
    System.out.println("original string: " + s + "\nreversed string: " + sb);
  }
}
