package java_9thClass;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    // It's a Interface extends Collection

    public static void main(String[] args) {

        Queue<String> name = new LinkedList<>();
        name.add("Moni");
        name.add("Rekha");
        name.add("Miru");
        name.add("Hiru");

        System.out.println("******* List *********");
        for (String obj:name) {
            System.out.println(obj);
        }

        System.out.println("******* After List *********");
        System.out.println("This is name.element() : "+name.element()); // Print the first Data of the Queue
        System.out.println("This is name.poll() : "+name.poll());       // Peek and Remove Data from the Queue
        System.out.println("This is name.peek() : "+name.peek());       // Peek the first Data from the Queue
        System.out.println("This is name.remove() : "+name.remove());   // Remove the first Data of the Queue

        System.out.println("******* List *********");

        for (String obj:name) {
            System.out.println(obj);
        }

    }
}
