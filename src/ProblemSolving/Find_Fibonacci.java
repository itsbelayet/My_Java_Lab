package ProblemSolving;

import java.util.Scanner;

public class Find_Fibonacci {
    public static void main(String[] args) {

        //Write 20 Fibonacci numbers with java.
        // Fibonacci Numbers : 0,1,1 ,2,3,5,8,13
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Fibonacci Number : ");
        int num=sc.nextInt();

        int firstNum = 0, secondNum = 1, fibonacci;
        System.out.print(firstNum + ", " + secondNum);
        for (int i = 3; i <= num; i++) {
            fibonacci = firstNum + secondNum;
            System.out.print(", " + fibonacci);
            firstNum = secondNum;
            secondNum = fibonacci;
        }
    }
}
