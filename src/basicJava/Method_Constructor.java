package basicJava;

public class Method_Constructor {

    String name;
    int age;
    //Syntax of Constructor : Only Class Name();
    //                        No need public void etc.
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
        System.out.println("This is Default Method");
    }

    void Lmd(int salary, int month) {
        System.out.println("Yearly Salary is : " + salary * month);
    }

    void Lmd(String nm, int age) {
        System.out.println("Name : " + nm + " " + age);
    }
}
