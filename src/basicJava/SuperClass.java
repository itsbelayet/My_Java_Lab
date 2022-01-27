package basicJava;
public class SuperClass{
    SuperClass() {
        System.out.println("This is Parent (Super)");
    }
}

class ChildClass extends SuperClass {
    public static void main(String[] args) {
        new ChildClass();
        new SuperClass();
    }

    ChildClass() {
        super();                                		// Print “This is Super Class”
        System.out.println("This is Child (Child)");	// Print “This is SuperThis”
    }
}

