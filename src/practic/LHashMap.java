package practic;

import java.util.HashMap;
import java.util.Map;

public class LHashMap {

    public static void main(String[] args) {
        HashMap<Integer,String> obj = new HashMap<>();
        obj.put(101,"Miru");
        obj.put(102,"Hiru");
        obj.put(103,"Moni");
        obj.put(104,"Rekha");

        System.out.println(obj.get(103));

        for (Map.Entry ob :obj.entrySet() ) {
            System.out.println(ob);

        }
    }
}
