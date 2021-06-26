package practic;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

        int [] stID=new int[10];                    // Return 10 Random Number
        Random random=new Random(5);            // Start from 5
        for (int i=0; i<stID.length; i++){
            stID[i]=random.nextInt(20);         // End bound 20
            System.out.println(stID[i]);
        }

        System.out.println("******* Another approach *******\n");

        for(int i=0; i<10; i++){
            System.out.println(Math.random());
        }

    }
}
