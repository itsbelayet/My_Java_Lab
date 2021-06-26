package ProblemSolving;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        //CheckPalindrome();            // Using Scanner

        findPalindrome("MOM");
        findPalindrome("Madam");
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
