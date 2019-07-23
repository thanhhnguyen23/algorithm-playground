package datastructures.list.arrays;

/**
 * demonstrates array class with low-level interface
 */
class LowArray {

    // refer to array a
    private long[] a;
    //--------------------------------------------------------------------------------
    // constructor
    public LowArray(int size){

        // create array
        a = new long[size];
    }
    //--------------------------------------------------------------------------------
    // setter - mutator
    public void setElem(int index, long value){
        // set value
        a[index] = value;
    }
    //--------------------------------------------------------------------------------
    // getter - accessor
    public long getElem(int index){
        // get value
        return a[index];
    }
} // end class LowArray

public class LowArrayApp{

    public static void main(String[] args) {
        // reference
        LowArray arr;

        // create LowArray object
        arr = new LowArray(100);

        // number of items in array
        int nElems = 0;

        // loop variable
        int j;

        // insert 10 items
        arr.setElem(0, 77);
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 22);
        arr.setElem(5, 88);
        arr.setElem(6, 11);
        arr.setElem(7, 00);
        arr.setElem(8, 66);
        arr.setElem(9, 33);

        // now 10 items in array
        nElems = 10;

        for(j = 0; j < nElems; j++){
            System.out.print(arr.getElem(j) + " ");
        }
        System.out.println("");

        // search for data item
        int searchKey = 26;

        // for each element
        for(j = 0; j < nElems; j++){
            // found item?
            if(arr.getElem(j) == searchKey)
                break;
        }
        if( j == nElems){
            System.out.println("Can't find " + searchKey);
        }
        else{
            System.out.println("Found " + searchKey);
        }

        // delete value 55
        for(j = 0; j < nElems; j++){
            // looking for value 55
            if(arr.getElem(j) == 55){
                break;
            }
        }
        // higher ones down
        for(int k = j; k < nElems; k++){
            arr.setElem(k, arr.getElem(k + 1));
        }
        // decrement size
        nElems--;

        // display items
        for(j = 0; j < nElems; j++){
            System.out.println(arr.getElem(j) + " ");
        }
        System.out.println("");
    } // end main()
} // end class LowArrayApp

