package java_8thClass;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Learn_List {

    static void ListMethod(){
        List<String> lname=new LinkedList<String>();

        //List<String> obj = new LinkedList<>();

        lname.add("Miru");
        lname.add("Hiru");
        lname.add("Moni");
        lname.add("Rekha");

//        for (String ob:lname) {
//            System.out.println(ob);
//        }

        Iterator obj=lname.iterator();

        System.out.println(obj.hasNext());      // Object is true
        System.out.println("***************\n");

        // Print each element one after another
//        System.out.println(obj.next());
//        System.out.println(obj.next());
//        System.out.println(obj.next());
//        System.out.println(obj.next());

        // Print each element by while loop
        while (obj.hasNext()){
            System.out.println(obj.next());
        }

        System.out.println("*************\n");
        System.out.println(obj.hasNext());      // Object is false
    }

    public static void main(String[] args) {
        ListMethod();
    }
}
