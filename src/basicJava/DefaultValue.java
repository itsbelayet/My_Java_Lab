package basicJava;

public class DefaultValue {

    static String name;
    static int age;
    static boolean alive;

    public static void main(String[] args) {
        System.out.println("Default Value of String : " + name);
        System.out.println("Default Value of boolean : "+alive);
        if (age > -1) System.out.println("Default Value of int : " + age);

    }
}
