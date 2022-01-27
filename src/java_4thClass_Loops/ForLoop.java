package java_4thClass_Loops;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        ForLoop.DisplayLoop();
    }


    public static void DisplayLoop(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Row Number : ");
        int row =input.nextInt();

        for (int i=1; i<=row; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println(); //For print next line
        }
    }
}
