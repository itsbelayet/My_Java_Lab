package java_9thClass.collection_Array;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Learn_LinkHashSet {
    public static void main(String[] args) {

        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);
        set1.add(60);
        System.out.println("Set one :"+set1);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(40);
        set2.add(50);
        set2.add(60);
        set2.add(70);
        System.out.println("Set two :"+set2);

//        // Union two Array
//        set1.addAll(set2);
//        System.out.println("Union two Array set: "+set1); //[10, 20, 30, 40, 50, 60, 70]

//        // Union Common Elements: (Intersection)
//        set1.retainAll(set2);
//        System.out.println("Common Elements :"+set1); // [40, 50, 60]

        // Defferent Elements only
//        set1.removeAll(set2);
//        System.out.println("Defferent Elements :"+set1); // [10, 20, 30]

        //SubSet:
//        boolean bo=set1.containsAll(set2);
//        System.out.println("Set one containing set two: "+bo); // false

    }
}
