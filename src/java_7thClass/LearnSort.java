package java_7thClass;

public class LearnSort {

    public static void main(String[] args) {


        int[] number = {34, 67, 23, 3, 6, 70, 110, 90};

        for (int i = 0; i < number.length; i++) {
            int j = i - 1;
            int point = number[i];
            while (j >= 0 && number[j] > point) {
                number[j + 1] = number[j];
                j = j - 1;
            }
            number[j + 1] = point;
        }
        for (int n = 0; n < number.length; n++) {
            System.out.print(number[n] + " ");
        }
    }

}
