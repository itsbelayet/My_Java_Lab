package java_4thClass_Loops;

import java.util.Scanner;

public class SwitchCase {

    public static void choose() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Geting Number : ");
        int getChoice = input.nextInt();

        String result;
        switch (getChoice) {
            case 1:
                result = "One";
                break;
            case 2:
                result = "Two";
                break;
            case 3:
                result = "Three";
                break;
            case 4:
                result = "Four";
                break;
            case 5:
                result = "Five";
                break;
            default:
                result = "This is out of bound";
                break;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        SwitchCase.choose();
    }
}

