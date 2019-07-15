package datastructures.arrays;

/**
 * demonstrates array class with high-level interface
 */
class HighArray {
    // ref to array a
    private long[] a;

    // number of data items
    private int nElems;

    // constructor
    public HighArray(int max) {
        // create array
        a = new long[max];
        // no items yet
        nElems = 0;
    }
    //--------------------------------------------------------------------------------
    // 2.1 add a method called getMax()
    //      > returns the value of the highest key in the array
    //      > return -1 if the array is empty
    //--------------------------------------------------------------------------------

    public long getMax(){

        long maxValue = a[0];

        for (int i = 0; i < nElems; i++){
            if(a[i] > maxValue){
                maxValue = a[i];
            }
        }
        return maxValue;
    }
    //--------------------------------------------------------------------------------
    // 2.2 add a method called removeMax()
    //      > find and remove from array
    //--------------------------------------------------------------------------------



    //--------------------------------------------------------------------------------
    // find specified key
    public boolean find(long searchKey) {
        int j;

        // for each element
        for (j = 0; j < nElems; j++) {
            // found item?
            if (a[j] == searchKey)
                break;
        }
        // gone to end?
        if (j == nElems)
            // yes, can't find it
            return false;
        else
            // no, found it
            return true;

    } // end find()

    //--------------------------------------------------------------------------------
    // put element into array
    public void insert(long value) {

        // insert it
        a[nElems] = value;
        // increment size
        nElems++;
    }

    //--------------------------------------------------------------------------------
    public boolean delete(long value) {
        int j;
        // look for it
        for (j = 0; j < nElems; j++) {
            if (value == a[j])
                break;
            if (j == nElems) {
                // cant find it
                return false;
            }
            // found it
            else {
                // move higher ones down
                for (int k = j; k < nElems; k++) {
                    a[k] = a[k + 1];
                }
                nElems--;
                return true;
            }
        }
        return false;
    } // end delete

    //--------------------------------------------------------------------------------
    // displays array contents
    public void display() {
        // for each element
        for (int j = 0; j < nElems; j++) {
            // display it
            System.out.println(a[j] + " ");
        }
        System.out.println(" ");
    }
    //--------------------------------------------------------------------------------

} // end class HighArray

class HighArrayApp {

    public static void main(String[] args) {

        // array size
        int maxSize = 100;
        // reference to array
        HighArray arr;

        // create the array
        arr = new HighArray(maxSize);

        // insert 10 items
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        // display items
        arr.display();
        //--------------------------------------------------------------------------------
        // removeMax() driver method
        //--------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------
        // getMax() driver method
        //--------------------------------------------------------------------------------
//        Long result = arr.getMax();
//        System.out.println("max value: " + result);
        //--------------------------------------------------------------------------------

        // search for item
//        int searchKey = 35;
//        if (arr.find(searchKey)) {
//            System.out.println("Found " + searchKey);
//
//        } else {
//            System.out.println("Can't Find " + searchKey);
//        }

        // delete 3 items
//        arr.delete(00);
//        arr.delete(55);
//        arr.delete(99);


        // display items again
//        arr.display();

    }// end main()

} // end class HighArrayApp
