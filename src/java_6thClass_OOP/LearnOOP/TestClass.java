package java_6thClass_OOP.LearnOOP;

public class TestClass extends ParentsClass  {
    public static void main(String[] args) {
        RegularClass obj=new RegularClass();
        obj.abstractMethod();
        obj.interfaceMethod();

        Honda ob=new Honda();
        ob.wheel();

        EncapsulClass ec=new EncapsulClass();
        ec.setName("Miru");
        System.out.println(ec.getName());

        // Inheritance
        learnInherit();     // Inherit from ParentsClass
        new ParentsClass(); // Constructor can't Inherit
    }

}
