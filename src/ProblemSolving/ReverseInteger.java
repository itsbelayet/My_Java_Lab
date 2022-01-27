package ProblemSolving;

import java.util.Scanner;

public class ReverseInteger {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter you Number : ");
        int num =input.nextInt();
        System.out.println("Before Reverse   : "+num+"\n");

        // One approach
        System.out.println("Reverse Number is: "+(new StringBuffer(String.valueOf(num)).reverse()));

        // Another approach
        int rev=0;
        while (num !=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("After Reverse    : "+rev);
    }
}
