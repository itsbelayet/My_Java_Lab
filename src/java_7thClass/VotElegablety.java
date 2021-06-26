package java_7thClass;

import java.util.Scanner;

public class VotElegablety {
    public static void CheckElegablety(){
        Scanner scnObj=new Scanner(System.in);
        System.out.print("Enter your Age : ");
        int age =scnObj.nextInt();

        if (age>=18){
            System.out.println("You are Eligible for Vot");
        }else {
            System.out.println("Sorry, You are not Eligible for Vot");
        }
    }
}
