package java_5thClass;

public enum Color {

    RED, BLUE, YELLOW, GREEN, VIOLET;

    String name;
    int age = 57;

    public static void DisplayColor() {
        System.out.println(Color.YELLOW);
    }

    Color() {               //It is Default Constructor
        this.name = "Miru";
    }

    Color(String name, int age) {   // It is Parametrized Constructor
        this.name = name;
        this.age = age;
        System.out.println("Name is : "+this.name+" Age "+this.age);
    }

    public static void main(String[] args) {
        Color.DisplayColor();
    }
};
