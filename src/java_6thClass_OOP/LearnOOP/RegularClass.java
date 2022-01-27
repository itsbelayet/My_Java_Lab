package java_6thClass_OOP.LearnOOP;

public class RegularClass extends Learn_AbstractClass implements Learn_Interface {

    @Override
    void abstractMethod() {
        System.out.println("This is Abstract Method");
    }

    @Override
    public void interfaceMethod() {
        System.out.println("This is Interface Method");
    }
}
