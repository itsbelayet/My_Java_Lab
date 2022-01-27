package java_6thClass_OOP;

public abstract class AbstractClass {

    /*
    //Constructor can created, Object also can created
    AbstractClass(){
        System.out.println("This is AbstractClass");
    }
    public static void main(String[] args) {
        AbstractClass abstractClass=new AbstractChild();
        abstractClass.AbsAA3();
    }
     */

    // Variable Declaration (Declare and Initialization can do)
    String fname;       // Only Declare
    int salary=5000;    // Declare and Initialize

    // Abstract Method
    public abstract void AbsAA1();
    public abstract void AbsAA2();

    // Regular Method
    public void AbsAA3(){
        System.out.println("This is Regular Method of Abstract Class");
    }
}
