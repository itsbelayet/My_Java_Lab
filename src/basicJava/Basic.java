package basicJava;

public class Basic extends TOOP{                        // Confusion

    static String name = "Miru";
    static int age;

    void TMethod() {

        System.out.println(name);
        System.out.println(fnametoop);

//**********************************************
        Basic bc = new Basic();
        name = "Hiru";
        bc.name = "Miru";             //Global Variable Call by Object Name or
        Basic.age = 57;               // If static Call by Class Name
        System.out.println(name);
        System.out.println(bc.name);
    }

    public static void main(String[] args) {
//        String bd="chrome";
//        String os="window";
//        String pf="local";
//
//        if (pf.equalsIgnoreCase("local")){
//            System.out.println("This is Cloud");
//        }else {
//            System.out.println("This is Local");
//        }
        TOOP.testOop();
        Basic obj = new Basic();
        obj.TMethod();

//**************************************************
        Basic bc = new Basic();
        bc.TMethod();

        System.out.println("********************\n");

        String nm = "Belayet";
        String nm1 = new String("Zakir");

        System.out.println(nm + " " + nm1);
        System.out.println(nm.isEmpty());

        System.out.println("********************\n");
        VarargsMethod ob = new VarargsMethod();
        ob.add(25, 50);
        ob.add(50, 75, 65);
        ob.add(125, 250, 380, 560);

    }
}
