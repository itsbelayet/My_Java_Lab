package java_9thClass.collection_Array;

import java.util.ArrayList;
import java.util.List;

public class Learn_ArrayList {
    public static void main(String[] args) {
        // Declaration
        List al1 = new ArrayList();
        ArrayList al2 = new ArrayList();            // Object type data can entered
        ArrayList<String> al3 = new ArrayList<>();  // String type data can entered

        al2.add(500);
        al2.add("Miru");
        al2.add(true);
        al2.add(5.27);
        //System.out.println(al2);

        al3.add("Miru");
        al3.add("Hiru");
        al3.add("Moni");
        al3.add("Rekha");

        al3.remove(2);
        al3.remove("Miru");
        int sz = al3.size();
        int id = al3.indexOf("Rekha");
        //al3.clear();
        boolean bo = al3.isEmpty();                   // Check Array is empty or not
        boolean bl = al3.contains("Mamun");
        Object[] toa = al3.toArray();

        al2.addAll(al3);                            // Add collection
        System.out.println("After add collection :" + al2);

        System.out.println(al3);
        System.out.println("Array Size is      : " + sz);
        System.out.println("Index of Rekha is  : " + id);
        System.out.println("Array is empty     : " + bo);
        System.out.println("Array Contain Mamun: " + bl);
        System.out.println("Convert to Array   : " + toa);

    }
}
