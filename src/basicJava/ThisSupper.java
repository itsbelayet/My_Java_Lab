package basicJava;

public class ThisSupper {

    String name;
    int age;
    static String address="718 Taylor Avenue";

    public void display(){
        this.name="Miru";
    }

    public static void display1(){
        System.out.println("This is static method");
    }
}
