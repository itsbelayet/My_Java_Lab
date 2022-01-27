package java_6thClass_OOP.Polymerphism;

public class Toyota extends ModernCar {

    @Override
    public void camera360() {
        System.out.println("This Overriding Method from Toyota ");
    }
    @Override
    public void metter() {
        System.out.println("This is Overriding Car has Metter");
    }

    public static void main(String[] args) {
        Toyota toyota=new Toyota();
        toyota.camera360();
        toyota.metter();

    }
}
