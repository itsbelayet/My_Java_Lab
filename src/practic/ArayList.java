package practic;

import java.util.ArrayList;

public class ArayList {

    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();
        name.add("Miru 0");
        name.add("Hiru 1");
        name.add("Moni 2");
        name.add("Rekha3");
        name.add("Rafi 4");
        name.add("Rodo 5");

        System.out.println(name.indexOf("Moni 2"));
        System.out.println(name.get(3));            // 3 index velue will show
        name.remove(3);
        System.out.println(name.indexOf("Rafi 4"));
        System.out.println(name.get(3));

        System.out.println("************************\n");
        ara();

    }

    static void ara(){
        ArrayList<Integer> age= new ArrayList<>();
        age.add(101);
        age.add(202);
        age.add(303);
        age.add(404);
        age.remove(1);
        System.out.println(age.get(2));
    }
}
