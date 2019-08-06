package datastructures.list.arrays;

import java.util.ArrayList;

public class RemoveEven {

    /**
     * remove even integers from array
     */
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.add(5);
        myArray.add(6);
        myArray.add(7);
        myArray.add(8);
        myArray.add(9);
        myArray.add(10);

        removeEven(myArray);
    }

    public static void removeEven(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) % 2 == 0){
                a.remove(a.remove(a.get(i)));
            }
        }
        printArray(a);
    }

    private static void printArray(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }

}
