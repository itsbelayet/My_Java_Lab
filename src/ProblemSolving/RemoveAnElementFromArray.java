package ProblemSolving;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class RemoveAnElementFromArray {
    public static void main(String[] args) {

        //Define an array with elements

        String[] arrayBeforeRemoval = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six"};

        System.out.println("\n============= Array Before Removal ==============");
        System.out.println(Arrays.toString(arrayBeforeRemoval));

        String[] arrayAfterRemoval = ArrayUtils.remove(arrayBeforeRemoval, 4);

        System.out.println("\n===== Array After Removal element at index 4 =====");

        System.out.println(Arrays.toString(arrayAfterRemoval));
    }
}
