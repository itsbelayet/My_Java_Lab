package usefullMethod;

import java.util.Arrays;

public class SortingArray {
    // Sorting a Array

    public static void main(String[] args) {

//      int[] arrayA={3,6,1,2,5,4};

        int[] arrayA=new int[6];
        arrayA[0]=3;
        arrayA[1]=6;
        arrayA[2]=1;
        arrayA[3]=2;
        arrayA[4]=5;
        arrayA[5]=4;

        // Before sorting
        System.out.println(Arrays.toString(arrayA));

        // After sorting
        Arrays.sort(arrayA);

        for (int ar:arrayA) {
            System.out.println(ar+" ");
        }

        System.out.println("***** Ascending Order ******\n");
        // Ascending order
        for (int i=0;i<6;i++){
            System.out.print(" "+arrayA[i]);
        }

        System.out.println("\n***** Decending Order ******\n");
        // Decending order
        for (int i=5;i>=0;i--){
            System.out.print(" "+arrayA[i]);
        }
    }
}
