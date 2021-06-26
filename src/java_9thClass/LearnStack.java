package java_9thClass;

import java.util.Iterator;
import java.util.Stack;

public class LearnStack {

    public static void main(String[] args) {
        Stack<String> stname = new Stack<>();
        stname.push("Queens, NY");
        stname.push("Manhattan, NY");
        stname.push("Bronx, NY");
        stname.push("Brooklyn, NY");
        stname.push("Long Island, NY");

        System.out.println("****** Print all value ********");
        System.out.println(stname);
        for (String ob : stname) {
            System.out.println(ob);
        }

        System.out.println("\n**** print last value and remove *****");
        System.out.println(stname.pop());       // pop Retrieve value and remove

        System.out.println("\n**** After remove Print all value *****");
        System.out.println(stname);
        for (String ob : stname) {
            System.out.println(ob);
        }

        System.out.println("************************\n");

        Stack<String> ssn = new Stack<>();
        for (int i = 0; i < 5; i++) {
            ssn.push("SSN-" + i);
        }
        System.out.println(ssn);

        System.out.println("\n***** Print all value from the Stack ****");
        for (String ob : ssn) {
            System.out.println(ob);
        }

        System.out.println("\n***** POP Value from the Stack and Remove one by one ****");
        Iterator it = ssn.iterator();
        while (it.hasNext()) {
            System.out.println(ssn.pop());
        }


        System.out.println("**************************************************\n");

        Stack<String> name = new Stack<>();

        name.push("Moni");
        name.push("Rekha");
        name.push("Miru");
        name.push("Hiru");

        System.out.println("Retrive the elements from the Stack");
        for (String st : name) {
            System.out.println(st);
        }

        searchStack(name, "Miru");      // Call the Method
    }

    static void searchStack(Stack<String> stkName, String item) {
        int pos = stkName.search(item);
        if (pos == -1) {
            System.out.println("\nItem not Found");
        } else {
            System.out.println("\nItem Found at position : " + pos+" as LIFO order");
        }
    }

}
