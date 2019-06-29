import java.util.HashSet;

public class RemoveDuplicates {
  /*
   * given sorted array, remove duplicates in place such that each element appear
   * only once and return the new length do not allocate extra space for another
   * array, you must do this in place with constant memory
   */

  public static void main(String[] args) {

    int[] arr = {1,2,3}; 

    int result = removeDuplicates(arr);
    System.out.println(result);
  }

  private static int removeDuplicates(int[] arr) {
    HashSet noDuplicates = new HashSet<>();

    for (int element : arr) {
      noDuplicates.add(element);
    }
    int result = noDuplicates.size();

    return result;
  }

}
