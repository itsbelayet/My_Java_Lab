package ProblemSolving;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you String : ");
        String str = input.nextLine();
        System.out.println("Before Reverse   : " + str + "\n");
        System.out.println("Reverse String is: " + (new StringBuffer(String.valueOf(str)).reverse()));

        // Another approach
//        System.out.print("Enter you Text : ");
//        String text = new Scanner(System.in).nextLine();
//        System.out.println(new StringBuffer(text).reverse());
    }
}
