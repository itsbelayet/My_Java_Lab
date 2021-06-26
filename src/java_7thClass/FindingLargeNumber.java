package java_7thClass;

import java.util.Scanner;

public class FindingLargeNumber {
    static void TempLN() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you Number : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();

        int lnum;
        if (num1 > num2 && num1 > num3 && num1 > num4) {
            lnum = num1;
        } else if (num2 > num3 && num2 > num4) {
            lnum = num2;
        } else if (num3 > num4) {
            lnum = num3;
        } else {
            lnum = num4;
        }
        System.out.println(lnum);
    }

    public static void main(String[] args) {
        FindingLargeNumber.TempLN();
    }
}
