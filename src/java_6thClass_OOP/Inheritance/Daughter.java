package java_6thClass_OOP.Inheritance;

public class Daughter extends Father{   // Hierarchical Inheritance
    public void house(){
        System.out.println("Daughter's has House");
    }

    public static void main(String[] args) {
        Daughter daughter=new Daughter();
        daughter.house();
        daughter.land();
        daughter.property();
    }
}
