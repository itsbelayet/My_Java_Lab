package java_4thClass_Loops;

import java.util.Scanner;

public class IfElse {

    public static void Calculator() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Age : ");
        int age = input.nextInt();

        if (age <= 12) {
            System.out.println("You are baby");
        } else if (age > 12 && age < 20) {
            System.out.println("You are Teenage");
        } else if (age >= 20 && age < 65) {
            System.out.println("You are Adult");
        } else if (age >= 65) {
            System.out.println("You are Senior Citizen");
        }

    }

    public static void main(String[] args) {
        IfElse.Calculator();
    }
}
