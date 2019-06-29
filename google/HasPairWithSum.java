import java.util.HashSet;


/*
 * given a sum, does an array have the elements that equates to sum given
 */
public class HasPairWithSum {
  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40, 50 };
    int sum = 90;
    // boolean result = hasPairWithSum2(arr, sum);
    boolean result = hasPairWithSum(arr, sum);
    System.out.println(result);
  }

  // solution 1
  // 1. what are the inputs/ouputs?
  // 1.1 inputs: array of integers and sum
  // 2. identify time/space/memory constraints
  // 2.1 variables: i , j
  // 3. brute force problem, so this solution isn't the best solution
  // 4. pseudocode
  // 5. identify edge cases that might break the code
  // 6. test the code line by line
  // 7. identify future improvements that can be made
  private static boolean hasPairWithSum(int[] arr, int sum) {
    // 2 for-loops -> O(n^2)
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == sum) {
          return true;
        }
      }
    }
    return false;
  }

  // solution 2
  private static boolean hasPairWithSum2(int[] arr, int sum) {
    /*
     * java has many set implementations - HashSet, TreeSet, and LinkedHashSet 
     *    > HashSet is the best performing data structure implementation within the Collections API
     *    > LinkedHashSet is slightly slower than HasSet due to the overhead of mainintaining LinkedList to maintain insertion order of elements
     */
  // 1. what are the inputs/ouputs?
  // 1.1 inputs: array of integers and sum
  // 2. identify time/space/memory constraints
  // 2.1 variables: i , j
  // 2.2 special data set that would allow us to retrieve and values quickly
  // 3. this solution is slightly better than the last one (2 for-loops is worse than having a hashset data structure)
  // 4. pseudocode
  // 5. identify edge cases that might break the code
  // 6. test the code line by line
  // 7. identify future improvements that can be made
    HashSet<Integer> hs = new HashSet<>();

    for (int i = 0; i < arr.length; i++) {
      if (hs.contains(arr[i])) {
        return true;
      }
      hs.add(sum - arr[i]);
    }
    return false;
  }
}
