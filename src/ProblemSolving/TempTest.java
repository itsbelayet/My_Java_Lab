package ProblemSolving;

import java.util.ArrayList;

public class TempTest {
    public static void main(String[] args) {

        ArrayList al=new ArrayList(5);
        al.add(2);
        al.add("Miru");
        al.add(true);
        al.add(10);
        al.add("Miru");
        al.add(true);

        al.remove("Miru");
        al.removeAll(al);
        System.out.println(al);
        System.out.println(al.size());

    }
}
