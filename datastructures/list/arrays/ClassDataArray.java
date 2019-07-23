package datastructures.list.arrays;

/**
 * data items as class objects
 */
class Person{
    private String lastName;
    private String firstName;
    private int age;

    //--------------------------------------------------------------------------------
    // constructor
    public Person(String last, String first, int a){
        lastName = last;
        firstName = first;
        age = a;
    }
    //--------------------------------------------------------------------------------
    public void displayPerson(){
        System.out.print("\nLast name: " + lastName);
        System.out.print(", First name: " + firstName);
        System.out.print(", Age: " + age);
    }
    //--------------------------------------------------------------------------------
    // get last name
    public String getLast(){
        return lastName;
    }
} // end class Person

class ClassDataArray {
    // reference to array
    private Person[] a;

    // number of data items
    private int nElems;

    // constructor
    public ClassDataArray(int max){

        // create array
        a = new Person[max];

        // no items yet
        nElems = 0;
    }
    //--------------------------------------------------------------------------------

    // find specified value
    public Person find(String searchName){
        int j;
        // for each element
        for(j = 0; j < nElems; j++){
            // found item?
            if(a[j].getLast().equals(searchName))
                // exit loop before end
                break;
        }
        if(j == nElems){
            // yes, can't find it
            return null;
        }
        else{
            // no, found it
            return a[j];
        }
    } // end find()
    //--------------------------------------------------------------------------------
    // put person into array
    public void insert(String last, String first, int age){
        a[nElems] = new Person(last, first, age);
        // increment size
        nElems++;
    }
    //--------------------------------------------------------------------------------

    // delete person from array

    public boolean delete(String searchName){
        int j;
        // look for it
        for(j = 0; j < nElems; j++){
            if(a[j].getLast().equals(searchName))
                break;
        }
        // can't find it
        if(j == nElems){

            return false;
        }
        // found it
        else{
            // shift down
            for(int k = j; k < nElems; k++){
                a[k] = a[k + 1];
            }
            // decrement size
            nElems--;
            return true;
        }
    } // end delete()
    //--------------------------------------------------------------------------------
    // display array contents
    public void displayA(){
        // for each element
        for(int j = 0; j < nElems; j++){

            // display it
            a[j].displayPerson();
        }
    }
    //--------------------------------------------------------------------------------
}// end class ClassDataArray

class ClassDataApp{
    public static void main(String[] args) {

        // array size
        int maxSize = 100;

        // reference to array
        ClassDataArray arr;

        // create the array
        arr = new ClassDataArray(maxSize);

        // insert 10 items
        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Lamarque", "Henry", 54);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucina", 18);

        System.out.println("");
        // display items
        arr.displayA();

        // search for item
        String searchKey = "Stimson";

        Person found;

        found = arr.find(searchKey);
        if(found != null){
            System.out.print(" \nFound! " + searchKey);
            found.displayPerson();
        }
        else{
            System.out.println("Can't find " + searchKey);
        }
        System.out.println("\nDeleting Smith, Yee, and Creswell");
        // delete 3 items
        arr.delete("Smith");
        arr.delete("Yee");
        arr.delete("Creswell");

        // display items again
        arr.displayA();

    } // end main()
} // end class ClassDataApp
