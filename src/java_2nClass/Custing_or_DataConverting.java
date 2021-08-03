package java_2nClass;

public class Custing_or_DataConverting {

    public static void main(String[] args) {
        System.out.println("******* int to double **********");
        int num = 25;
        double num1 = (double) num;
        int nu=12;
        double num2=(double)(num+nu)/2;
        System.out.println("Before Convert double = " + num);
        System.out.println("After Convert double = " + num1);
        System.out.println((double) 52);
        System.out.println();

        System.out.println("******* double to int **********");
        double price = 55.278;
        int price1 = (int) price;
        System.out.println("Before Convert int = " + price);
        System.out.println("After Convert int = " + price1);
        System.out.println((int) 52.102);
        System.out.println();

        System.out.println("******* int to String **********\n");
        int val = 123123123;
        String str1 = Integer.toString(val);
        System.out.println("One approach     = " + str1);

        int c = 321321321;
        String str2 = String.valueOf(c);
        System.out.println("Another approach = " + str2);
        System.out.println();

        System.out.println("******* String to int (only int value) **********\n");
        String st = "17362";
        System.out.println("Before Convert to int = " + st);
        System.out.println("After Convert to int  = " + Integer.parseInt(st));
        System.out.println(st + 8);
        System.out.println();

        System.out.println("******* String to int (Mix value) **********\n");
        String sint = "My age 57, Year of Birth 64, Current year 2021";
        System.out.println("Before Convert Mix String: "+sint);
        sint = (sint.replaceAll("\\D+", ""));
        System.out.println("After Convert int String : "+sint);
        int sint1= Integer.parseInt(sint);
        System.out.println("After Convert int        : "+ sint1+" Add 9 = "+(sint1+9));

        System.out.println("****************************\n");
        String sint2 = "347-547-9857";
        System.out.println("Before Convert Mix String: " + sint2);
        String sint3 = sint2.replaceAll("\\D+", "");
        System.out.println("After Convert int String : " + sint3);

        long ints = Long.parseLong(sint3);
        System.out.println("After Convert long value : " + ints + " Add 3 = " + (ints + 3));

    }
}
