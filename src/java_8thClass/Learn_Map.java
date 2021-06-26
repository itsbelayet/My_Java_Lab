package java_8thClass;

import java.util.HashMap;
import java.util.Map;

public class Learn_Map {

    static void MapMethod(){

        Map<String,String> objMap=new HashMap<>();

        objMap.put("USA","NY");
        objMap.put("Bangladesh","Dhaka");
        objMap.put("India","Delhi");
        objMap.put("UK","London");
        objMap.put("Napal","Katmundu");

        System.out.println("UK Value is : "+objMap.get("UK"));       // Print Single value
        System.out.println(objMap.values());                        // Print All the values of Map

        System.out.println("***************************\n");

        for (Map.Entry<String,String> ob : objMap.entrySet()) {     // Print All value of Map by for each loop
            System.out.println(ob.getKey()+" : "+ob.getValue());
        }

        // Alternative Approach
        System.out.println("****** Alternative Approach After Remove UK ********\n");
        objMap.remove("UK");
        for (String obj : objMap.keySet()) {
            System.out.println(obj+" : "+objMap.get(obj));
        }
    }

    public static void main(String[] args) {
        Learn_Map.MapMethod();
    }
}
