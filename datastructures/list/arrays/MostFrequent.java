package datastructures.list.arrays;

import java.util.HashMap;

public class MostFrequent {
    // given: [1,3,1,3,2,1]
    // return: 1 since it appears 3 times in given array

    /**
     * variables
     */
    // maxCount
    // maxItem
    // count

    /**
     * for-loop
     */

    /**
     * hash-table
     * --------------
     * key -> item
     * value -> count
     */

    public static void main(String[] args) {
        System.out.println("given: [1,3,1,3,2,1]\nWhich element appears the most in this array? ");
//        System.out.println("1 appears 3 times");

        Integer[] array = {1,3,1,3,2,1};

        HashMap<Integer, Integer> myHashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++){
//            System.out.println(array[i]);
            if(myHashMap.containsKey(array[i])){
                myHashMap.put(array[i], myHashMap.get(array[i]) + 1);
            }
            else{
                myHashMap.put(array[i], 1);
            }
        }
//        System.out.println("printing out myHashMap: " + myHashMap);
//        System.out.println(myHashMap.keySet());
//        System.out.println(myHashMap.values());

    }



}
