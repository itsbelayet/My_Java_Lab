package ProblemSolving;

import java.util.Scanner;

public class Find_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int num = sc.nextInt();

        boolean stu = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                stu = true;
                break;
            }
        }
        if (stu == true) {
            System.out.println(num+" is not Prime Number");
        } else {
            System.out.println(num+" is Prime Number");
        }

    }
}
