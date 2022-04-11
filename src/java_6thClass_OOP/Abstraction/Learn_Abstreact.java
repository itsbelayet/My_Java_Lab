package java_6thClass_OOP.Abstraction;

public class Learn_Abstreact extends AbstractParents implements LearnInterface, Learn_Interface {
    @Override
    public void women() {       // Implement Method in Abstract Class
        System.out.println("Women are Mother");
    }

    public void girl() {         // Override Method in Abstract Class
        System.out.println("Women are Daughter");
    }

    public static void main(String[] args) {
        Learn_Abstreact la = new Learn_Abstreact();
        la.women();
        la.girl();
        la.Boy();
    }

    @Override
    public void Boy() {         // Implement Method in Interface
        System.out.println("Boy can be Father");
    }

    @Override
    public void kids() {
        System.out.println("Kids can Boy and Girl");
    }

}

interface LearnInterface {
    void Boy();

}