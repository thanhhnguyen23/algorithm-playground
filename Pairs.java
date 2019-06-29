public class Pairs{
  public static void main(String[]args){
    // log all pairs of array
    final String[] BOXES = {"a", "b", "c", "d"};

    logAllPairsOfArray(BOXES);
  }
  private static void logAllPairsOfArray(String[] arr){
    for (int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr.length; j++){
        // example 1
        // System.out.println(i + j);
        // example 2
        System.out.println(arr[i] + arr[j]);
      }
    }
  }
}
