package datastructures.list.arrays;

// demonstrates ordered array class
class OrdArray{
    // ref to array a
    private long[] a;
    // number of data items
    private int nElems;
    //--------------------------------------------------------------------------------
    // constructor
    public OrdArray(int max){
        a = new long[max];
        nElems = 0;
    }
    //--------------------------------------------------------------------------------
    public int size(){
        return nElems;
    }
    //--------------------------------------------------------------------------------
    public int find(long searchKey){
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while(true){
            curIn = (lowerBound + upperBound) / 2;

            if(a[curIn] == searchKey){
                // found it
                return curIn;
            }
            else if(lowerBound > upperBound){
                // can't find it
                return nElems;
            }
            else{
                if(a[curIn] < searchKey){
                    // its' in upper half
                    lowerBound = curIn + 1;
                }
                else{
                    // it's in lower half
                    upperBound = curIn;
                }

            } // end else divide range

        } // end while

    } // end find()
    //--------------------------------------------------------------------------------
    // put element into array
    public void insert(long value){
        int j;
        // find where it goes
        for(j = 0; j < nElems; j++){
            // linear search
            if (a[j] > value){
                break;
            }
        }
        // move bigger ones up
        for(int k = nElems; k > j; k--){
            a[k] = a[k - 1];
        }
        // insert it
        a[j] = value;
        nElems++;
    } // end insert()
    //--------------------------------------------------------------------------------
    public boolean delete(long value){
        int j = find(value);
        if(j == nElems){
            return false;
        }
        else{
            for (int k =j; k < nElems; k++){
                a[k] = a[k + 1];
            }
            nElems--;
            return true;
        }
    } // end delete()

    //--------------------------------------------------------------------------------
    // display array contents
    public void display(){
        // for each element
        for(int j = 0; j < nElems; j++){
            // display it
            System.out.print(a[j] + " ");
        }
        System.out.println("");
    }
    //--------------------------------------------------------------------------------

} // end class OrdArray
public class OrderedApp {
    public static void main(String[] args) {
        // array size
        int maxSize = 100;

        // reference to array
        OrdArray arr;

        // create the array
        arr = new OrdArray(maxSize);

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

        // search for item
        int searchKey = 55;
        if(arr.find(searchKey) != arr.size()){
            System.out.println("Found " + searchKey);
        }
        else{
            System.out.println("Can't find " + searchKey);
        }
        // display items
        arr.display();

        // delete 3 items
        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        // display items again
        arr.display();

    } // end main()

} // end class OrderedApp
