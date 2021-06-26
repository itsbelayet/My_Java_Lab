package ProblemSolving;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnSortedArray {
    // Merge two Array into single Sorted Array without Duplicates
    // 1st Array = {12, -7, 18, 9, 37, -1, 21}
    // 2nd Array = {27, 8, 71, 0, -9, 18, 12, -7}
    // Output    = {-9, -7, -1, 0, 8, 9, 12, 18, 21, 27, 37, 71}

    public static void main(String[] args) {
        int[] arrayA={12, -7, 18, 9, 37, -1, 21};
        int[] arrayB={27, 8, 71, 0, -9, 18, 12, -7};

        // Merge two Array
        int[] mergeArray=merging(arrayA,arrayB);

        // To Print Array to String
        System.out.println("\n1st Array : "+ Arrays.toString(arrayA));
        System.out.println("2nd Array : "+ Arrays.toString(arrayB)+"\n");

        System.out.println("************ Sorted Array **************\n");
        System.out.println(Arrays.toString(mergeArray));
    }

    public static int[] merging(int[] arrayA,int[] arrayB){

        IntStream num = IntStream.concat(IntStream.of(arrayA), IntStream.of(arrayB));

        int[] output=num.distinct().sorted().toArray();
        return output;


        //.sorted() --> This Method Used for Sording Data
        //.distinct() --> This Method Used for remove Duplicate Data

        // Another approach (Recommended)
        // return IntStream.concat(IntStream.of(arrayA), IntStream.of(arrayB)).distinct().sorted().toArray();

    }

}
