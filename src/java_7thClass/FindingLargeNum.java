package java_7thClass;

import java.util.Scanner;

public class FindingLargeNum {

    public static void FindNumber() {
        Scanner numObj = new Scanner(System.in);
        System.out.print("Enter Three Integer Number :");
        int num1 = numObj.nextInt();
        int num2 = numObj.nextInt();
        int num3 = numObj.nextInt();
        int lNum;
        if (num1 > num2 && num1 > num3) {
            lNum = num1;
        } else if (num2 > num3) {
            lNum = num2;
        } else {
            lNum = num3;
        }
        System.out.println("Large Number is : " + lNum);
    }
}
