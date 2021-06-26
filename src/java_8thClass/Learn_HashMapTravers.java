package java_8thClass;

import java.util.HashMap;
import java.util.Map;

public class Learn_HashMapTravers {
    public static void main(String[] args) {
        int[] number={23,45,59,23,25,75,23,45,90};
       // System.out.println(number);
        for (int num:number) {
            System.out.print(num+",");
        }
        System.out.println("\n*********************\n");
        FindFrequncy(number);
    }
    static void FindFrequncy(int[] arr){
        HashMap<Integer,Integer> obj=new HashMap<>();

        for(int i=0; i<arr.length; i++){
            Integer c=obj.get(arr[i]);
            if(obj.get(arr[i])==null){
                obj.put(arr[i],1);
            }else{
                obj.put(arr[i],++c);
            }
        }
        for (Map.Entry ob : obj.entrySet()) {
            System.out.println("Frequency of "+ob.getKey()+" : "+ob.getValue());
        }
    }

}
