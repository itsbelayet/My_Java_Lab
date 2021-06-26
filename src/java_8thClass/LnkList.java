package java_8thClass;

import java.util.LinkedList;

public class LnkList {

    static LinkedList<String> llName = new LinkedList<String >();

    static void LLMethod(){

        LnkList.llName.add("Mamun");

        llName.add("Mohammed");
        llName.add("Belayet ");
        llName.add("Hossain");
        llName.add("Zakir   ");
        llName.add("Enayet  ");

        for (String ob:llName) {
            System.out.println(ob+" Index is "+llName.indexOf(ob));
        }
        System.out.println();

        llName.remove(1);
        llName.remove("Hossain");

        System.out.println("******** After Removeing ****\n");

        for (String ob1:llName) {
            System.out.println(ob1+" Index is "+llName.indexOf(ob1));
        }
    }

    public static void main(String[] args) {
        LnkList.LLMethod();
    }
}
