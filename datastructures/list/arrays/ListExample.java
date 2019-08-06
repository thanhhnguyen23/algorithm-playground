package datastructures.list.arrays;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        /**
         * List vs ArrayList
         *  > List is an interface
         *  > ArrayList is a class
         *
         *  > List interface extends Collection framework
         *  > ArrayList extends Abstract Class and implements List interface
         *
         * List<Integer> ... ArrayList<>() is used to use different implementations of List easily
         *      > ArrayList<E>
         *      > Vector<E>
         *      > LinkedList<E>
         */
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
