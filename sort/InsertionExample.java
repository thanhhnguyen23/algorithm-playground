package sort;

public class InsertionExample {
    public static void main(String[] args) {
        /**
         * INSERTION SORT (A)
         *
         * j -> indicates the "current card" being inserted into the hand
         *
         * subarray consisting of elements A[1...j - 1] constitutes the current sorted hand
         * remaining subarray A[j + 1...n] corresponds to the pile of cards still on the table
         *
         * for j = 2 to A.length
         *      key = A[j]
         *      // insert A[j] into sorted sequence A[1...j - 1]
         *      i = j - 1
         *      while i > 0 and A[i] > key
         *          A[i + 1] = A[i]
         *          i = i - 1
         *      A[i + 1] = key
         *
         */
        // a. [5,2,4,6,1,3]
        // b. [2,5,4,6,1,3]
        // c. [2,4,5,6,1,3]
        // d. [2,4,5,6,1,3]
        // e. [1,2,4,5,6,3]
        // f. [1,2,3,4,5,6]

        //--------------------------------------------------------------------------------
//        int[] array = {5,2,4,6,1,3};
        int[] array = {3, 1, 9};

        myInsertionSort(array);

    }

    private static int[] myInsertionSort(int[] A){
        for(int j = 0; j < A.length; j++){
            int key = A[j];
            int i = j - 1;
            while (i > 0 && A[i] > key){
                A[i + 1] = A[i];
                i = i - 1;
            }
            A[i + 1] = key;
        }
        return A;
    }
}
