package sort.quick;

public class MyQuickSort {
    static void printArray(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    void sort(int arr[], int low, int high) {
        if (low < high) {
            /**
             * partitioning index -> pIndex
             */
            int pIndex = partition(arr, low, high);
            /**
             * recursively sort elements before partition
             */
            sort(arr, low, pIndex - 1);
            /**
             * recursively sort elements after partition
             */
            sort(arr, pIndex + 1, high);
        }

    }

    int partition(int arr[], int low, int high) {
        /**
         * function takes last element as pivot, places the pivot element at its correct position in sorted array,
         * and places all smaller (smaller than pivot) to let of pivot and all greater elements to right of pivot
         */
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {

            /**
             * if current element is smaller than or equal to pivot
             */
            if (arr[j] <= pivot) {
                i++;
                /**
                 * swap arr[i] and arr[j]
                 */
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        /**
         * swap arr[i + 1] and arr[high] (or pivot)
         */
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;

    }
    public static void main(String[] args) {

//        int arr[] = {10, 7, 8, 9, 1, 5};
        int arr[] = {4,3,5,1};

        int len = arr.length;

        MyQuickSort myQuickSort = new MyQuickSort();

        myQuickSort.sort(arr, 0, len - 1); // TODO -- sort() method

        System.out.println("sorted array");
        printArray(arr);
    }

}
