package java_9thClass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetUnion {
    public static void main(String[] args) {

        int[] num1 = {1, 3, 5, 7, 9, 11, 8, 4, 23};
        int[] num2 = {2, 4, 6, 8, 10, 11, 12, 3, 7, 44};
        System.out.print("Array1 : ");
        for (int n1:num1) {
            System.out.print(n1+", ");
        }
        System.out.print("\nArray2 : ");
        for (int n2:num2) {
            System.out.print(n2+", ");
        }
        //*******************************************************************************************

        // Joining two Arrays
        Set<Integer> number1 = new HashSet<>();
        number1.addAll(Arrays.asList(new Integer[]{1, 3, 5, 7, 9, 11, 8, 4, 23}));

        Set<Integer> number2 = new HashSet<>();
        number2.addAll(Arrays.asList(new Integer[]{2, 4, 6, 8, 10, 11, 12, 3, 7, 44}));

        Set<Integer> union=new HashSet<>(number1);
        union.addAll(number2);

        System.out.println("\n\nJoining two Arrays : "+union);

        // Common values
        Set<Integer> intersection=new HashSet<>(number1);
        intersection.retainAll(number2);

        System.out.println("\nCommon Elements of two Arrays               : "+intersection);

        // Difference (Which elements of number1 array is not present in number2 array)
        Set<Integer> difference=new HashSet<>(number1);
        difference.removeAll(number2);

        System.out.println("\nElements which is not present in 2nd Arrays :"+difference);
    }
}
