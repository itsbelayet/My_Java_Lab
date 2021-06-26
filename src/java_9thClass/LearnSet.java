package java_9thClass;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    // it's an Interface extends Collection

    public static void main(String[] args) {

        Set<String> mBrand=new HashSet<>();

        mBrand.add("Apple");
        mBrand.add("Nokia");
        mBrand.add("Samsung");
        mBrand.add("Oppo");
        mBrand.add("iPhone");

        System.out.println("Set Size : "+mBrand.size());

        System.out.println("\n********* Print All Brand **********");
        System.out.println(mBrand);
        for (String ob:mBrand) {
            System.out.println(ob);
        }

        System.out.println("\n********************************");
        mBrand.remove("Nokia");
        System.out.println("\n**** After Remove Nokia******");

        System.out.println(mBrand);

        System.out.println("\n********* Contains menes is or not **********");

        System.out.println(mBrand.contains("Apple"));
    }
}
