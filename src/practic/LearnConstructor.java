package practic;

public class LearnConstructor {
    int id;
    String name;

    LearnConstructor() {                // Constructor
        System.out.println("This is Constructor");
    }
    public LearnConstructor(int id, String name) {  // Constructor
        this.id = id;
        this.name = name;
        System.out.println(id + "  " + name);
    }

    static void LConstructor() {               // Method
        System.out.println("This is method");
    }
    void LConstructor(int stid, String stname) {    // Method
        this.id = stid;
        this.name = stname;
        System.out.println(stid+"  "+stname);
    }

}
