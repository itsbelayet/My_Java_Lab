package java_8thClass;

import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {

        int [] num=new int[10];

        Random rdom=new Random(5);        // Starting Number that is "5"
        for (int i=0; i<num.length; i++){
            num[i]=rdom.nextInt(30);    // Ending Number that is "30"
            System.out.println(num[i]);
        }
    }

}
