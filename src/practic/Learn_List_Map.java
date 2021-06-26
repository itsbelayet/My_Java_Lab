package practic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Learn_List_Map {

    public static void main(String[] args) {

        List<String> listBD = new ArrayList<>();
        listBD.add("Dhaka");
        listBD.add("Dinajpur");
        listBD.add("Faridpur");
        listBD.add("Jamalpur");

        List<String> listUK=new ArrayList<>();
        listUK.add("Liverpool");
        listUK.add("Manchester");
        listUK.add("Scotland");
        listUK.add("London");

        List<String> listUS=new ArrayList<>();
        listUS.add("New York");
        listUS.add("Florida");
        listUS.add("Taxes");
        listUS.add("New Jersey");

        Map<String,List<String>> mp = new HashMap<>();

        mp.put("Bangladesh",listBD);
        mp.put("Enagland",listUK);
        mp.put("USA",listUS);

        for (Map.Entry<String,List<String>> obj : mp.entrySet()){
            System.out.println(obj.getKey()+" : "+obj.getValue());
        }

    }
}
