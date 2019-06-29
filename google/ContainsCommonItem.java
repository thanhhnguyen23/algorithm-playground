import java.util.HashMap;

public class ContainsCommonItem {
  /*
   * given 2 arrays, create a function that let's a user know (true/false) whether
   * these two arrays contain any common items
   */

  /*
   * for example: 
   *  > array1 = ['a', 'b', 'c', 'x'] 
   *  > array2 = ['z', 'y', 'i'] should return false
   * 
   *  > array1 = ['a','b','c','x'] 
   *  > array2 = ['z','y','x'] should return true
   */

  public static void main(String[] args) {
    // 2 parameters - int[] - no size limit
    // return true/false

    // brute force: nested loop where array[0] is being compared to every element of
    // the other input array
    // time complexity: O(n^2)
    int[] arr1 = { 1, 2, 3, 4, 5 };
    // int[] arr2 = {5,6,7,8,9};
    int[] arr2 = { 6, 7, 8, 9 };
    // boolean result = containsCommonItem(arr1, arr2);
    containsCommonItem2(arr1, arr2);
  }

  private static boolean containsCommonItem(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        // System.out.println(arr1[i] + " " + arr2[j]);
        if (arr1[i] == arr2[j]) {
          return true;
        }
      }
    }
    return false;
  }

  private static Boolean containsCommonItem2(int[] arr1, int[] arr2) {
    /*
     * array1 = ['a', 'b', 'c', 'x'] array2 = ['z', 'y', 'a']
     */

    // loop through first array and create object where properties == items in the
    // array

    HashMap myMap = new HashMap<>();

    for (int i = 0; i < arr1.length; i++) {
      // if myMap contains any of the elements from array1
      if (!myMap.containsKey(arr1[i])) {
        // if key doesn't exist, we will add it to our map
        myMap.put(arr1[i], true);
      }
    }
    System.out.println(myMap);

    // loop through second array and check if item in second array exists on created
    // object
    for (int j = 0; j < arr2.length; j++) {
      if (!myMap.containsKey(arr2[i])) {
        myMap.put(arr2[i], true);
        return true;
      }
    }
    return false;

  }
}
