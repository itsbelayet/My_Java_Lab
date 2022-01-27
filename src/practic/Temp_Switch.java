package practic;

import java.util.Scanner;

public class Temp_Switch {
    public static void main(String[] args) {
        Scanner inpute=new Scanner(System.in);
        System.out.print("Enter your desired number: ");
        int getChoice=inpute.nextInt();
        switch (getChoice) {
            case 1:
                System.out.print("You Choose One");
                break;
            case 2:
                System.out.print("You Choose Two");
                break;
            default:
                System.out.print("You Choose Wrong");
        }
        inpute.close();

    }
}
