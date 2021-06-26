package java_6thClass;

public abstract class AbstractClass {

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
