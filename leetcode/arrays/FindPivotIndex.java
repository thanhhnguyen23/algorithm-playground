package leetcode.arrays;

public class FindPivotIndex {
    /**
     * given an array of integers nums, write a method that returns the "pivot" index of this array
     * <p>
     * nums = [1,7,3,6,5,6]
     * 3 --> pivot index of array
     * > sum of the numbers oto the left of index 3 (nums[3] = 6) is wqual to the sum of numbers to the right of index 3
     * [1,7,3] -> 11
     * [5,6] -> 11
     */
    public static Integer findPivotIndex(Integer[] a) {

        int sum = 0;
        for(int i = 0; i < a.length;i++){
            sum += a[i];
        }
        System.out.println("sum: " + sum);

        int tempSum = sum;
        for(int i = 0; i < a.length; i++){
            tempSum -= a[i];
        }
        System.out.println("tempSum: " + tempSum);
        if(tempSum == 0){
            int pivotIndex = a[a.length/2];
            printArray(a);
            return pivotIndex;
        }

        return -1;
    }

    public static void main(String[] args) {
        Integer[] nums = {1,7,3,6,5,6}; // return 6
//        Integer[] nums = {1, 2, 2, 1}; // return 2

        Integer result = findPivotIndex(nums);
        System.out.println(result);
    }

    public static void printArray(Integer[] a){
        for(Integer i : a){
            System.out.println(i);
        }
    }

}
