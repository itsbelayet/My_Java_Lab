package java_8thClass;

import java.util.HashMap;
import java.util.Map;

public class FindFrequency {
    public static void main(String[] args) {
        String [] name= new String[6];
        name[0]="Miru";
        name[1]="Hiru";
        name[2]="Moni";
        name[3]="Miru";
        name[4]="Hiru";
        name[5]="Miru";

        for (String nm:name) {
            System.out.print(nm+",");
        }
        System.out.println("\n*********************\n");
        FindFrequncy(name);
    }
    static void FindFrequncy(String[] arr){
        HashMap<String,String> obj=new HashMap<>();

        //System.out.println(obj.get(arr[1]));

        for(int i=0; i<arr.length; i++){
                String c=obj.get(arr[i]);
            System.out.println(obj.get(arr[i]));
            if(obj.get(arr[i])==null){
                System.out.println(obj.put(arr[i],"one"));
                //obj.put(arr[i],1);
                obj.put(arr[i],c);
            }else{
               //obj.put(arr[i],++c);
            }
        }
       //-----------------
//        for(int i=0; i<arr.length; i++){
//            Integer c=obj.get(arr[i]);
//            if(obj.get(arr[i])==null){
//                obj.put(arr[i],1);
//            }else{
//                obj.put(arr[i],++c);
//            }
//        }
       //------------------




        for (Map.Entry ob : obj.entrySet()) {
            System.out.println("Frequency of "+ob.getKey()+" : "+ob.getValue());
        }
    }
}
