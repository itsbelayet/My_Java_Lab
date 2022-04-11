package java_6thClass_OOP.Inheritance;

public class Son extends Father{    // Multilevel Inheritance
    public void car(){
        System.out.println("Son's has Car");
    }

    public static void main(String[] args) {
        Son son=new Son();
        son.car();
        son.land();
        son.property();
    }
}
