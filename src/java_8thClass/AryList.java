package java_8thClass;

import java.util.ArrayList;

public class AryList {

    // Declare a Array List (Single Dimension)
    ArrayList<String> alName = new ArrayList<String>();
    ArrayList<Integer> alID= new ArrayList<Integer>();       // Wrapper Class

    void ALMethod(){
        // Adding Value to Array List
        alName.add("Miru ");
        alName.add("Hiru ");
        alName.add("Moni ");
        alName.add("Rekha");
        alName.add("Shima");

        alID.add(102);
        alID.add(105);
        alID.add(109);
        alID.add(505);
        alID.add(605);

        // Print Index Number of Array element
        System.out.println("---- Print Index Number -----\n");

        System.out.println("Rekha's index is "+(alName.indexOf("Rekha")));

        System.out.println("******* Before Remove ************\n");

        for (String o1:alName){
            System.out.println(o1+" Index is "+(alName.indexOf(o1)));
        }

        System.out.println("******* After Remove ************\n");
        alName.remove("Moni");
        alName.remove(1);

        for (String o1:alName){
            System.out.println(o1+" Index is "+(alName.indexOf(o1)));
        }

        System.out.println("******** Print Array List *********\n");

        for (String ob:alName) {
            System.out.println(ob);
        }
        System.out.println("---------------------\n");
        for (int ob1:alID){
            System.out.println(ob1);
        }

        // Remove Value to Array List
        alName.remove(2);                    // Remove Index wise
        alName.remove("Miru");                  // Remove Value wise

        //al1Name.remove(505);
        alID.remove(3);                    // Remove Index wise
        alID.remove(Integer.valueOf(102));       // Remove Value wise
        System.out.println("*****************\n");

        for (String obj:alName) {
            System.out.println(obj);
        }
        System.out.println("==================\n");
        for (int obj1:alID) {
            System.out.println(obj1);
        }
        System.out.println("**** Print All Value of Array List ***");
        System.out.println(alName);
        System.out.println(alID);
    }

    public static void main(String[] args) {
        AryList al=new AryList();
        al.ALMethod();

        System.out.println("\n**************");
        ArrayList<Integer> test=new ArrayList<>();
        test.add(10);
        test.add(20);
        test.add(30);
        test.add(40);
        test.add(50);

        test.add(1,200);        // Add value(200) to 1st index of array list
        System.out.println(test.size());     // Print array Size
        System.out.println(test.get(1));     // Print value of 1st index of array list
        System.out.println(test.get(test.size()-1));    // Print value of last index of array list

    }


}
