package java_2nClass_Custing_Scanner_NestedClass;

import java.util.Scanner;

public class LearnScanner {
    //getData.next();   Have to test
    //getData.nextInt();
    public static void main(String[] args) {
        //Creating Scanner object
        Scanner getData = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name=getData.nextLine();
        //System.out.println("Your Name is :"+name);
        System.out.print("Enter your Address : ");
        String address=getData.nextLine();
        //System.out.println("Your Address : "+address);

        System.out.println("Your Name is: "+name+" Address: "+address);
        getData.close(); //For close Scanner
    }
}
