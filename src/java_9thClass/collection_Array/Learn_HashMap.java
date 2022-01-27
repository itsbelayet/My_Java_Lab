package java_9thClass.collection_Array;

import java.util.HashMap;

public class Learn_HashMap {
    public static void main(String[] args) {
        // Duplicate Key not Allow
        // Duplicate Value Allow
        // Null Value Allow
        // Search operation faster

        /*
        HashMap hs =new HashMap();
        hs.put(57,"Miru");
        hs.put("Hiru",55);
        hs.put(true,"Brother");
        System.out.println(hs);
        */

        HashMap<Integer,String> mobj=new HashMap<>();
        mobj.put(55,"Hiru");
        mobj.put(58,"Miru");
        mobj.put(60,"Rekha");
        mobj.put(62,"Moni");
        mobj.put(63,"Mamun");

        mobj.remove(58);
        System.out.println(mobj);

        System.out.println(mobj.get(60));
        System.out.println(mobj.containsKey(50));
        System.out.println(mobj.containsValue("Hiru"));
        System.out.println(mobj.isEmpty());
        System.out.println(mobj.size());
        System.out.println(mobj.entrySet());
        
    }
}
