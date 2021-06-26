package java_9thClass;

import org.junit.Assert;

import java.util.Arrays;

public class UnitTest {

    public static void main(String[] args) {
        int[] unSort = {2, 5, 1, 3, 6, 4};
        int[] sorted = {1, 2, 3, 4, 5, 6};
        Learn_Sort sort=new Learn_Sort();
        sort.bubbleSort(unSort);

        Assert.assertEquals("Not Sorted",Arrays.toString(sorted),Arrays.toString(unSort));
    }
}
