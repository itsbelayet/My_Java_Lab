package ProblemSolving;

public class Find_MinValue {
    public static void main(String[] args) {
        minimum(getArray());
        //System.out.println(getArray());

        int[] number={ 33,23,12,67,55,39};
        minimum(number);

    }

    static void minimum(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Minimum Value is : "+min);
    }

    static int[] getArray() {
        return new int[]{84, 55, 70, 78, 90, 100};
    }
}
