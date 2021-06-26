package java_11thClass_UnitTest.ProblemSolving;

import java.util.Arrays;

public class CheckAnagram {

    public static boolean isAnagram(String st, String dt) {
        boolean status = true;

        if (st.length() != dt.length()) {
            status = false;
        } else {
            char[] arraySt = st.toLowerCase().toCharArray();
            char[] arrayDt = dt.toLowerCase().toCharArray();
            Arrays.sort(arrayDt);
            Arrays.sort(arraySt);
            status = Arrays.equals(arrayDt, arraySt);
        }
        System.out.println(st + " & " + dt + " are " + status);
        return status;
    }

    public static void main(String[] args) {
        isAnagram("CAT", "DAT");
        isAnagram("CAT", "ATC");
    }
}
