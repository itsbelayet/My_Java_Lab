package practic;

import java.util.Scanner;

public class LargeNum {
    static void LNum(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter three number: ");
        int num1= input.nextInt();
        int num2= input.nextInt();
        int num3= input.nextInt();
        int largenumber;
        if(num1>num2 && num1>num3){
            largenumber=num1;
        }else if(num2>num3){
            largenumber=num2;
        }else {
            largenumber = num3;
        }
        System.out.println(largenumber);
    }

    public static void main(String[] args) {
        LargeNum.LNum();
    }
}
