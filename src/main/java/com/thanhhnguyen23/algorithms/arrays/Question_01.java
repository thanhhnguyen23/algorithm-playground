package com.thanhhnguyen23.algorithms.arrays;

import java.util.Arrays;

/*
 * two number sum
 *
 * write a function that takes in a non-empty array of distinct integers and an integer representing a target sum.
 * if any two numbers in the input array sum up to the target sum, the function should return them in an array, in sorted order.
 * if no two numbers up to the target sum, the function should return an empty array.
 * assume that there will be at most one pair of numbers summing up the target sum.
 *
 * sample input: [3,5,-4,8,11,-1,6], 10
 * sample output: [-1,11]
 */
public class Question_01 {
    public static void main(String[] args) {
        int[] array = {3,5,-4,8,11,1,-1,6}; // target: 10
//        int[] array = {1,2,3,4,5,6,7,8,9}; // target: 17
//        int[] array = {4,6,1}; // target: 5
//        int[] array = {4,6,1,-3}; // target: 3
//        int[] array = {3,5,-4,8,11,1,-1,6}; // target: 10
//        int[] array = {-21,301,12,4,65,56,210,356,9,-47}; // target: 163
//        int[] array = {-21,301,12,4,65,56,210,356,9,-47}; // target: 164
//        int[] array = {3,5-4,8,11,1,-1,6}; // target: 15

        int[] result = twoNumberSum(array,10);
        System.out.println(Arrays.toString(result));
    }

//    solution 1 | time: O(n^2) | space: O(1)
    public static int[] twoNumberSum(int[] arr, int target){

        if(arr.length < 0) return new int[]{};

        for (int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return arr[i] < arr[j] ? new int[] {arr[i], arr[j]} : new int[] {arr[j], arr[i]};
                }
            }
        }
        return new int[]{};
    }






//    solution 2
//    public static int[] twoNumberSum(int[] arr, int targetSum){
//
//        Arrays.sort(arr);
//
//        int left = 0;
//        int right = arr.length -1;
//
//        while(left < right){
//            int currentSum = arr[left] + arr[right];
//
//            if(currentSum == targetSum){
//                return new int[] {arr[left], arr[right]};
//            }
//            else if(currentSum < targetSum){
//                left++;
//            }
//            else if(currentSum > targetSum){
//                right++;
//            }
//        }
//        return new int[0];
//    }

}
