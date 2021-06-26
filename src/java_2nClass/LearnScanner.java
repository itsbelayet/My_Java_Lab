package java_2nClass;

import java.util.Scanner;

public class LearnScanner {

    public static void main(String[] args) {
        //Creating Scanner object
        Scanner getData = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name=getData.nextLine();
        System.out.println("Your Name is :"+name);
        System.out.print("Enter your Address : ");
        String address=getData.nextLine();
        System.out.println("Your Address : "+address);

        getData.close(); //For close Scanner
    }

}
