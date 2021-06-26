package practic;

import java.util.Scanner;

public class IncreasDecreasOrder {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int fnumber=input.nextInt();
        System.out.print("Enter Second Number : ");
        int mnumber=input.nextInt();
        System.out.print("Enter Last Number : ");
        int lnumber=input.nextInt();

        if (fnumber<mnumber && mnumber<lnumber){
            System.out.println("This is Increasing Order");
        }else if (fnumber>mnumber && mnumber>lnumber){
            System.out.println("This is Decreasing Order");
        }else{
            System.out.println("Neither Increase or Decrease");
        }

    }
}
