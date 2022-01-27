package java_9thClass.collection_Array;

import java.util.PriorityQueue;

public class Learn_PriorityQueue {
    public static void main(String[] args) {

        // Only Homogeneous Data Allow in Priority Queue
        // Insertion order not preserved
        // Duplicate Value allow

        PriorityQueue pq=new PriorityQueue();
        pq.add("Miru");
        pq.add("Rekha");
        pq.offer("Moni");
        pq.offer("Rekha");
        pq.add("Hiru");
        //pq.add(500);          //Heterogeneous Data not allow
        System.out.println("All Elements : "+pq);  //[Hiru, Miru, Moni, Rekha, Rekha]
        //pq.clear();
        System.out.println("Retrieve 1st Date : "+pq.peek());    //Only Retrieve If blank return null
        System.out.println("Retrieve 1st Date : "+pq.element()); //Only Retrieve If blank return exception

        System.out.println("Delete 1st Value : "+pq.poll());     //Retrieve & Remove, If blank return null
        System.out.println("Delete 1st Value : "+pq.remove());   //Retrieve & Remove, If blank return exception

    }
}
