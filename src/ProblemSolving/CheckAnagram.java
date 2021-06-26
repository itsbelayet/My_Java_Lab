package ProblemSolving;

import java.util.Arrays;

public class CheckAnagram {

    public static void main(String[] args) {
        itsAnagram("CAT","ADT");
        itsAnagram("CAT","ACT");
    }

    static void itsAnagram(String st1, String st2) {
        String status = null;       // or = " "
        if (st1.length() != st2.length()) {
            status = "Not Anagram";
        } else {
            char[] st1arry = st1.toLowerCase().toCharArray();
            char[] st2arry = st2.toLowerCase().toCharArray();
            Arrays.sort(st1arry);
            Arrays.sort(st2arry);
            boolean stu=Arrays.equals(st1arry,st2arry);
            if(stu==false){
                status="Not Anagram";
            }else {
                status="Anagram";
            }
            System.out.println(st1+" & "+st2+" are "+status);
        }
    }

    // Another Approach
//    public static boolean isAnagram(String st, String dt) {
//        boolean status = true;
//
//        if (st.length() != dt.length()) {
//            status = false;
//        } else {
//            char[] arraySt = st.toLowerCase().toCharArray();
//            char[] arrayDt = dt.toLowerCase().toCharArray();
//            Arrays.sort(arrayDt);
//            Arrays.sort(arraySt);
//            status = Arrays.equals(arrayDt, arraySt);
//        }
//        System.out.println(st + " & " + dt + " are " + status);
//        return status;
//    }

// Another approach  **************************************************************

//    static String itAnagram(String sst, String ddt) {
//        String status = "";
//        if (sst.length() != ddt.length()) {
//            status = "Not Anagram";
//        } else {
//            char[] arraysst = sst.toLowerCase().toCharArray();
//            char[] arrayddt = ddt.toLowerCase().toCharArray();
//            Arrays.sort(arraysst);
//            Arrays.sort(arrayddt);
//            boolean stu=Arrays.equals(arraysst,arrayddt);
//
//            if (stu==false){
//                status="Not Anagram";
//            }else {
//                status="Anagram";
//            }
//        }
//        System.out.println(sst+" & "+ddt+" are "+status);
//        return status;
//    }
}
