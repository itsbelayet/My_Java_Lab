package practic;

import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<Integer> age=new LinkedList<>();
        age.add(57);
        age.add(25);
        age.add(75);
        age.add(95);

        System.out.println(age);
        System.out.println(age.indexOf(75));
        System.out.println(age.get(0));
    }
}
