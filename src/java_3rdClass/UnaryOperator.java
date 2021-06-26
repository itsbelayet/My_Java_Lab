package java_3rdClass;

public class UnaryOperator {

    // Increment Operator : ++   add 1 all time
    // Pre-Increment : ++number
    // Post-Increment: number++

    // Decrement Operator: -- Decrease -1
    // Pre-Decrement : --number
    // Post-Decrement: number--

    public static void main(String[] args) {
        int num = 20;

        System.out.println(num);
        num++;
        ++num;
        ++num;
        --num;
        num++;
        System.out.println(num);

    }
}
