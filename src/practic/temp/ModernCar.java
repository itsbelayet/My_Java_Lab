package practic.temp;

public abstract class ModernCar {
    String add;
    int age = 57;

    public abstract void display();     // This is abstract method

    public void carBreak() {
        System.out.println("Modern Can has Auto Break");
    }

    public int carDoor(int num) {
        num = 4;
        return num;
    }

    public static void carWeel() {
        System.out.println("Modern Car has Weel");
    }
}
