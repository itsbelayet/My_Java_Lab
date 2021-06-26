package java_8thClass;

import java.util.LinkedList;

public class StudentList {
    public static void main(String[] args) {
        LinkedList<Student> stList = new LinkedList<Student>();

        Student st1 =new Student(101,"Miru","14th Class");
        Student st2 =new Student(201,"Hiru","13th Class");
        Student st3 =new Student(303,"Moni","16th Class");
        Student st4 =new Student(405,"Rekha","10th Class");

        // Adding Student to the LinkedList
        stList.add(st1);
        stList.add(st2);
        stList.add(st3);
        stList.add(st4);

        // Print Student List
        for (Student st:stList) {
            System.out.println("ID: "+st.id+"|  Name: "+st.name+"|  Class: "+st.className);
        }

    }
}
