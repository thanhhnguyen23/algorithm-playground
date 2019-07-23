package datastructures.list.arrays;

/**
 * demonstrates Java arrays
 */
public class ArrayApp {

    public static void main(String[] args) {
        // reference to array
        long[] arr;

        // make array
        arr = new long[100];

        // number of items
        int nElems = 0;

        // loop counter
        int j;

        // key of item to search for
        long searchKey;

        // insert 10 items
        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;

        // now 10 items are in the array
        nElems = 10;

        //--------------------------------------------------------------------------------
        // display items
        for(j = 0; j < nElems; j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
        //--------------------------------------------------------------------------------

        // find item with key 66
        searchKey = 66;
        // for each element
        for(j = 0; j < nElems; j++){
            // found item?
            if(arr[j] == searchKey)
                // yes, exit before end
                break;
        }
        if(j == nElems){
            // yes
            System.out.println("Can't find " + searchKey);
        }
        else{
            // no
            System.out.println("Found " + searchKey);
        }
        //--------------------------------------------------------------------------------

        // delete item with key 55
        searchKey = 55;

        for(j = 0; j < nElems; j++){
            if(arr[j] == searchKey)
                break;
            // move higher ones down
            for(int k = j; k < nElems -1; k++){
                arr[k] = arr[k + 1];
            }
            // decrement size
            nElems--;
        }
        //--------------------------------------------------------------------------------
        // display items
        for(j = 0; j < nElems; j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
    }// end main()
} // end class ArrayApp
