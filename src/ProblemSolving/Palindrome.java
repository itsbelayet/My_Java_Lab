package ProblemSolving;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        //CheckPalindrome();            // Using Scanner
        checkStringPalindrome("madam");
        checkNumberPalindrome(52025);

        findPalindrome("Mom");
        findPalindrome("Madam");
    }
    static void checkStringPalindrome(String taxt){
        StringBuffer sb=new StringBuffer(taxt);
        String txt= sb.reverse().toString();

        if (taxt.equals(txt)){
            System.out.println(taxt+" is Palindrome");
        }else {
            System.out.println(taxt+" is Not Palindrome");
        }
    }
    static void checkNumberPalindrome(int val){
        String vtx=Integer.toString(val);
        StringBuffer sb=new StringBuffer(vtx);
        String vtex=sb.reverse().toString();

        if (vtx.equals(vtex)){
            System.out.println(vtx+" is Palindrome");
        }else{
            System.out.println(vtx+" is not Palindrome");
        }
    }
    static void CheckPalindrome() {
        String moon;
        String reverse = null;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Word to Check Palindrome :");

        moon = input.nextLine();
        int mlength = moon.length();

        for (int i = mlength - 1; i >= 0; i--) {
            reverse = reverse + moon.charAt(i);
        }

        if (moon.equals(reverse)) {
            System.out.println(moon + " Is a Palindrome");
        } else {
            System.out.println(moon + " is not a Palindrome");
        }
    }

    // Another approach:
    static void findPalindrome(String givenString){
        String reversString="";
        for (int i=givenString.length()-1; i>=0; i--){
            reversString=reversString+givenString.charAt(i);
        }
        System.out.println("\n---------------------------------");
        boolean flag=givenString.toUpperCase().equals(reversString.toUpperCase());
        if (flag==true){
            System.out.println(givenString+" is Palindrom");
        }else {
            System.out.println(givenString+" is not a Palindrom");
        }
    }
}
