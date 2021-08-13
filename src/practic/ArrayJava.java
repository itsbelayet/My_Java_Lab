package practic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class ArrayJava {
    static String name;
    public static void main(String[] args) {
        String add = null;
        objArray();
        System.out.println("\n************* "+name+" *************\n");
        renNumber();
        System.out.println("\n************* "+add+" *************\n");
        arrList();
        System.out.println("\n*************         *************\n");
    }

    static void objArray() {
        // How to add in a Object?
        Object[] objects = {2021, "Miru", 57, true, "Rekha", 60, "Hiru"};
        for (Object ob : objects) {
            System.out.println(ob);
        }
    }

    static void renNumber() {
        Random random = new Random();
        int[] arrNumber = new int[10];
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.println(random.nextInt(50));
        }
    }

    static void arrList() {
        ArrayList<String> loUS = new ArrayList<>();
        loUS.add("NY");
        loUS.add("BF");
        System.out.println(loUS);

        ArrayList<String> loCA = new ArrayList<>();
        loCA.add("CO");
        loCA.add("NH");
        System.out.println(loCA);

        HashMap<String, ArrayList<String>> countryMap = new HashMap<>();
        countryMap.put("USA", loUS);
        countryMap.put("CAN", loCA);
        System.out.println(countryMap);
    }

}
