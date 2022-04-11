package java_6thClass_OOP.Inheritance;

public class Learn_Inherit extends Learn_Inheritance{

    public static void main(String[] args) {
        // Only the static member can Inherit and
        // It it should use in a static Method

        System.out.println(myAddress);  // myAddress Inherit from Learn_Inheritance class
        staticMethod();                 // Inherit from Learn_Inheritance class
        test();
    }

    public static void test(){
        staticMethod();
    }
}
