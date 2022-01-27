package ProblemSolving;

import java.util.HashSet;

public class Find_ComonElementsBetweenTwoArrays {

    public static void main(String[] args) {
        stringValues();
        intValues();
    }

    static void stringValues() {
        String[] s1 = {"ONE", "THREE", "NINE", "SEVEN"};
        String[] s2 = {"Two", "One", "Four", "Seven", "Nine"};
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].toUpperCase().equals(s2[j].toUpperCase())) {
                    set.add(s1[i]);
                }
            }
        }
        System.out.println(set);
    }

    static void intValues() {
        int[] ints1 = {1, 3, 9, 7};
        int[] ints2 = {2, 1, 4, 7, 9};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < ints1.length; i++) {
            for (int j = 0; j < ints2.length; j++) {
                if (ints1[i] == ints2[j]) {
                    set.add(ints1[i]);
                }
            }
        }
        System.out.println(set);
    }
}
