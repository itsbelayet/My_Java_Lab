package java_9thClass.collection_Array;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Learn_LinkedList {
    public static void main(String[] args) {

        // Heterogeneous Data Allow in LinkedList
        // Insertion order preserved
        // Duplicate Value allow

//        List li = new LinkedList();
//        li.add(100);
//        li.add("Miru");
//        li.add(true);
//        li.add("Rekha");
//        li.add(100);
//        li.add(5.27);
//        System.out.println("Heterogeneous Data : " + li);

        LinkedList<Integer> lk = new LinkedList<>();
        lk.add(100);
        lk.add(200);
        lk.add(300);
        lk.add(400);
        lk.add(500);

        Iterator it=lk.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        lk.remove(3);
        lk.set(2, 30);           // For Replace
        System.out.println("\nArray Elements       : " + lk);
        System.out.println("Array Size is        : " + lk.size());
        System.out.println("Index of 500         : " + lk.indexOf(500));
        System.out.println("Element of 1st Index : " + lk.get(1));
    }
}
