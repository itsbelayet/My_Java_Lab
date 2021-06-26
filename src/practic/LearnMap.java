package practic;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {

        Map<String,Integer> name=new HashMap<String,Integer>();

        name.put("Moni",60);
        name.put("Hiru",50);
        name.put("Miru",57);

        //System.out.println("Key="+name.keySet()+" : "+"Value="+name.get("Hiru"));
        //System.out.println(name);

        System.out.println("\n***** To Retrieve all value ******\n");
        for (String ob:name.keySet()) {
            System.out.println(ob+" : "+name.get(ob));
        }

        System.out.println("\n***** Another approach ******\n");
        for (Map.Entry<String,Integer> obj:name.entrySet()){
            System.out.println(obj.getKey()+" : "+obj.getValue());
        }

    }
}
