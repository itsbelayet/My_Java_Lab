package ProblemSolving;

public class Find_MinMaxValue {

    int[] number = {12, 25, 5, 19, 1, 53, 9, 3, 7, 42};
    int min = number[0];

    public static void main(String[] args) {
        Find_MinMaxValue obj = new Find_MinMaxValue();
        obj.minimum();
        obj.maxmimum();
    }

    void minimum() {
        for (int i = 0; i < number.length; i++) {
            if (min > number[i]) {
                min = number[i];
            }
        }
        System.out.println("Minimum Value of the Array is : " + min);
    }

    void maxmimum() {
        for (int i = 0; i < number.length; i++) {
            if (min < number[i]) {
                min = number[i];
            }
        }
        System.out.println("Maximum Value of the Array is : " + min);
    }
}
