package java_6thClass_OOP.Inheritance;

public class Learn_Inheritance {
    // Declaration
    String myname="Belayet";
    static String myAddress="Bronx, New York";

    public void nonstaticMethod(){
        this.myname="Miru";
        System.out.println("Non static Method :"+this.myname);
    }

    public static void staticMethod(){
        System.out.println("This is static method");
    }
}
