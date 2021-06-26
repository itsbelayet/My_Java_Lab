package practic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LearnHashMap {

    public static void main(String[] args) {
        List<String> nameUS = new ArrayList<>();
        nameUS.add("NY");
        nameUS.add("FL");
        nameUS.add("NJ");

        List<String> nameUK = new ArrayList<>();
        nameUK.add("London");
        nameUK.add("Liverpool");
        nameUK.add("Manchaster");

        List<String> nameCN=new ArrayList<>();
        nameCN.add("Toranto");
        nameCN.add("Calgery");
        nameCN.add("Vancouber");

        Map<String,List<String>> stMap=new HashMap<>();
        stMap.put("US",nameUS);
        stMap.put("UK",nameUK);
        stMap.put("CN",nameCN);

        for (Map.Entry<String,List<String>> obj: stMap.entrySet()) {
            System.out.println(obj.getKey()+" : "+obj.getValue());
        }

    }

}
