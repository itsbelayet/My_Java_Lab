package ProblemSolving;

import java.util.Scanner;

public class TestExam {
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
            System.out.println("This is not Prime Number");
        } else {
            System.out.println("This is Prime Number");
        }

    }


//    public static boolean isPrimeNumber(int num) {
//        if (num <= 1) {
//            return false;
//        }
//        for (int i = 2; i < num; i++) {
//            if (num%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        if (isPrimeNumber(15)==true){
//            System.out.println("Its a Prime Number");
//        }else{
//            System.out.println("It's not a Prime Number");
//        }
//    }
}
