package java_8thClass;

import java.util.*;

public class Learn_ListHashMap {

    static void LHMMethod(){

        List<String> objUS=new LinkedList<>();
        objUS.add("NY");
        objUS.add("FL");
        objUS.add("Nj");

        List<String> objUK=new ArrayList<>();
        objUK.add("London");
        objUK.add("Liverpool");
        objUK.add("Scotland");

        List<String> objCN=new ArrayList<>();
        objCN.add("Toronto");
        objCN.add("Calgary");
        objCN.add("Vancouver");

        Map<String, List<String>> objMap=new HashMap<>();
        objMap.put("US",objUS);
        objMap.put("UK",objUK);
        objMap.put("CN",objCN);

        System.out.println(objMap.put("CN",objCN));         // Print Single Value of Map
        System.out.println("*******************\n");

        // Print All Value of Map
        for (Map.Entry<String,List<String>> oj : objMap.entrySet()) {
            System.out.println(oj.getKey()+" : "+oj.getValue());
        }
    }

    public static void main(String[] args) {
        Learn_ListHashMap.LHMMethod();
    }
}
