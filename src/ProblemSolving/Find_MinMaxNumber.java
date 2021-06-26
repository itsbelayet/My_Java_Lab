package ProblemSolving;

public class Find_MinMaxNumber {

    public static void main(String[] args) {

        //Find_MinMaxNumber fm = new Find_MinMaxNumber();
        System.out.println("25, 22, 75, 30, 99, 18, 85");

        // State approach
//        int[] number = {25, 22, 75, 30, 99, 18, 85};
//        fm.minumum(number);
//        maximum(number);

        // Dynamic approach
        minumum(getArray());
        maximum(getArray());

    }

    static void minumum(int[] arr) {                   // Non-Static Method for Minimum Value
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Minumum Value of the Array is : " + min);
    }

    static void maximum(int[] arry) {             // Static Method for Maximum Value
        int max = arry[0];
        for (int i = 0; i < arry.length; i++) {
            if (max < arry[i]) {
                max = arry[i];
            }
        }
        System.out.println("Maximum Value of the Array is : " + max);
    }

    static int[] getArray() {
        return new int[]{25, 22, 75, 30, 99, 18, 85};
    }
}
