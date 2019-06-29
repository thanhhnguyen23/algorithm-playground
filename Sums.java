import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sums{
    public static void main(String[]args){
        // print all numbers then all pair sums
        final int[] ARRAY = {1,2,3,4,5};
        printAllNumbersThenAllAPairSums(ARRAY);

    }
    private static void printAllNumbersThenAllAPairSums(int[] arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.println(arr[i] + arr[j]);
            }
        }
    }
}