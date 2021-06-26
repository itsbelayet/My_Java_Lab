package ProblemSolving;

import java.util.HashSet;

public class FindIntersectionOfTwoArrays {

    public static void main(String[] args) {


        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};

        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    set.add(s1[i]);
                }
            }
        }
        System.out.println(set);     //OUTPUT : [THREE, FOUR, FIVE]

//      ***********  Integer ********************
//        int[] ara1 = {5, 9, 12, 5, 7, 9, 13};
//        int[] ara2 = {15, 8, 17, 12, 7, 20, 15};
//
//        HashSet<Integer> hs = new HashSet<>();
//        for (int i = 0; i < ara1.length; i++) {
//            for (int j = 0; j < ara2.length; j++) {
//                if (ara1[i].equals(ara2[j])) {
//                    hs.add(ara1[i]);
//                }
//            }
//        }
//        System.out.println(hs);
    }
}
