package basicJava;

public class TestMethod_Constructor {

    public static void main(String[] args) {
        // Constructor   (Constructor can't be called, it's automaticaly called)
        Method_Constructor obj = new Method_Constructor();
        Method_Constructor obj1 = new Method_Constructor("Hiru");
        System.out.println("********************\n");

        // Method      (Method should be called)
        obj.LMethod(12,6);      //Calling Method through object
        obj.Lmd();
        obj.Lmd("Miru", 57);
        obj.Lmd(500, 12);
        System.out.println("********************\n");

        TestMethod_Constructor ob = new TestMethod_Constructor();
        ob.Display();   // Calling Method

    }
    void Display(){
        System.out.println("This is Miru");
        System.out.println("This is Hiru");
        System.out.println("This is Moni");
    }
}


