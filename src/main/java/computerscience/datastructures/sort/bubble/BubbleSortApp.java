package computerscience.datastructures.sort.bubble;

import java.lang.reflect.Array;

/**
 * BubbleSort.java
 *
 * demonstrate bubblesort
 */
public class BubbleSortApp {

    public static void main(String[] args) {
        int maxSize = 100;
        ArrayBub arr;

        arr = new ArrayBub(maxSize);

        System.out.println("display array elements");
        arr.display();
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.display();

        arr.bubbleSort();

        arr.display();
        arr.bubbleSort();
        arr.display();
    }

    private static class ArrayBub {
        /**
         * reference to array a
         */
        private long[] a;
        /**
         * number of data items
         */
        private int nElems;
        //--------------------------------------------------------------------------------
        public ArrayBub(int max){

            /**
             * create array
             */
            a = new long[max];
            /**
             * items
             */
            nElems = 0;
        }
        //--------------------------------------------------------------------------------

        /**
         * put element into array
         * @param value
         */
        public void insert(long value){

            a[nElems] = value;
            nElems++;
        }

        /**
         * display array contents
         */
        public void display(){
            for(int j = 0; j < nElems; j++){

                System.out.print(a[j] + " ");
            }
            System.out.println("");

        }
        public void bubbleSort(){

            int out, in;

            for(out = nElems -1; out > 1; out--){

                for(in = 0; in < out; in++){
                    if(a[in] > a[in + 1]){
                        swap(in, in + 1);
                    }
                }
            }
        }

        //--------------------------------------------------------------------------------

        private void swap(int one, int two) {
            long temp = a[one];
            a[one] = a[two];
            a[two] = temp;
        }
    }
}
