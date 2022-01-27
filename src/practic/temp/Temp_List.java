package practic.temp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Temp_List {

    public static void main(String[] args) {
//        Object [] ob={100,"Miru",true,"Rekha"};
//        ArrayList ob=new ArrayList();//{100,"Miru",true,"Rekha"};
//        ob.add(100);
//        ob.add("Miru");
//        ob.add(true);
//        ob.add("Rekha");

        List ob =new ArrayList<>();

        ob.add("Miru");
        ob.add(500);
        ob.add(true);
        ob.add(5.27);


        System.out.println(ob);

    /*    ArrayList<String> al = new ArrayList<>();
        al.add("Miru");
        al.add("Hiru");
        al.add("Rekha");
        al.add("Moni");
        Collections.sort(al);
        System.out.println("After sorting        :"+al);
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("After Revers sorting :"+al);*/
    }
}
