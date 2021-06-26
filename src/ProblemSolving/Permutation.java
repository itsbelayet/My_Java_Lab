package ProblemSolving;

public class Permutation {
    // Write a Java program to compute all Permutation of
    // String "ABC" ("ABC" "BAC" "BCA" "ACB" "CAB" "CBA")

    static void Permut(String alpha, String name) {

        if (name.length() == 0) {
            System.out.println(alpha+" ");
        }
        for (int i = 0; i < name.length(); i++) {
            String newName = alpha + name.charAt(i);
            String newAlpha = name.substring(0, i) + name.substring(i + 1);

            Permut(newName,newAlpha);   // Calling Method within Method
        }
    }

    public static void main(String[] args) {
        Permut("","CAT");
    }
}
