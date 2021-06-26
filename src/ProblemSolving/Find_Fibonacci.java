package ProblemSolving;

public class Find_Fibonacci {
    public static void main(String[] args) {

        //Write 20 Fibonacci numbers with java.
        // Fibonacci Numbers : 0,1,1 ,2,3,5,8,13

        int firstNum = 0, secondNum = 1, fibonacci;
        System.out.print(firstNum + ", " + secondNum);
        for (int i = 3; i <= 10; i++) {
            fibonacci = firstNum + secondNum;
            System.out.print(", " + fibonacci);
            firstNum = secondNum;
            secondNum = fibonacci;
        }
    }
}
