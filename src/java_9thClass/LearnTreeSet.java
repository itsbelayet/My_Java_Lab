package java_9thClass;

import java.util.TreeSet;

public class LearnTreeSet {
    // Is a Class
    // Same as Set

    public static void main(String[] args) {
        TreeSet<String> mBrand=new TreeSet<>();

        mBrand.add("Apple");
        mBrand.add("Nokia");
        mBrand.add("Samsung");
        mBrand.add("iPhone");
        mBrand.add("Maxcel");
        mBrand.add("Oppo");

        System.out.println("********* Print All Brand **********");
        System.out.println(mBrand);
        for (String st:mBrand) {
            System.out.println(st);
        }

        System.out.println("********************************\n");
        mBrand.pollFirst();
        mBrand.pollLast();
        for (String st:mBrand) {
            System.out.println(st);
        }
        mBrand.remove("Nokia");
        System.out.println("\n****** After Remove Nokia******");
        for (String st:mBrand) {
            System.out.println(st);
        }

        System.out.println("\n********* Contains Apple and Oppo is or not **********");
        System.out.println(mBrand.contains("Apple"));
        System.out.println(mBrand.contains("Oppo"));
    }
}
