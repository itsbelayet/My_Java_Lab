package java_9thClass;

import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<String> name=new PriorityQueue<>();

        name.add("Enayet");
        name.add("Ismat");
        name.add("Belayet");
        name.add("Zakir");

        PriorityQueue<Integer> age = new PriorityQueue<>();

        age.add(60);
        age.add(58);
        age.add(56);
        age.add(52);

        for (String st:name) {
            System.out.println(st);
        }
        System.out.println("******* Above List *********\n");
        System.out.println(name.peek());
        System.out.println(name.poll());
        System.out.println("*********************\n");

        for (Integer ag:age) {
            System.out.println(ag);
        }
        System.out.println("******* Above List *********\n");
        System.out.println(age.peek());
        System.out.println(age.poll());

    }
}
