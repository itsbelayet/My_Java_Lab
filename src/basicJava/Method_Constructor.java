package basicJava;

public class Method_Constructor {

    String name;
    int age;
    //Syntax of Constructor : Only Class Name();
    //                        No need public void etc.
    // Constructor:
    Method_Constructor() {
        this.name="Miru";
        System.out.println("This is Default Constructor "+name);
    }
    Method_Constructor(String nm) {
        System.out.println("This is Parametrized Constructor "+nm);
    }

    void LMethod(int mon, int day) {
        System.out.println("Daily Salary is : " + mon / day);
    }

    void Lmd() {
        name="Belayet";
        System.out.println("This is Default Method  "+name);
    }

    void Lmd(int salary, int month) {
        System.out.println("Yearly Salary is : " + salary * month);
    }

    void Lmd(String nm, int age) {
        System.out.println("Name : " + nm + " " + age);
    }
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
}
