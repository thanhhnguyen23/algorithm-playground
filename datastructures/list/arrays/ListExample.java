package datastructures.list.arrays;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // creating list
        List<Integer> listA = new ArrayList<>();
        listA.add(0, 100);
        listA.add(1, 200);

        System.out.println(listA);

        // creating another list
        List<Integer> listB = new ArrayList<>();
        listB.add(3);
        listB.add(5);
        listB.add(7);
        System.out.println(listB);


    }

}
