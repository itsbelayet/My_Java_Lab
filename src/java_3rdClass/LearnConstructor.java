package java_3rdClass;

public class LearnConstructor {

    //Default Constructor (It has no parameter/signature)
    //Parameterized Constructor (It has parameter)

    String fname, lname;
    int age, salary;

    public LearnConstructor() {                     //Default Constructor no parameter
        this.fname = "Mohammed";
        String lastname = "Hossain";
        System.out.println("My Name is " + this.fname + " " + lastname);
    }

    public LearnConstructor(String fname) {          //Single Parameterized Constructor
        System.out.println("My name is " + fname);
    }

    public LearnConstructor(String fname, String lname, int age) {
        this.fname = fname;
        //this.lname=lname;
        this.age = age;
        System.out.println("My name is " + this.fname + " " + lname + " age is " + this.age);
    }

    public LearnConstructor(String add, String city, String zip) {
        System.out.println("Address: " + add + " City: " + city + " Zip: " + zip);
    }

    public static void main(String[] args) {
        LearnConstructor obj = new LearnConstructor();
        LearnConstructor obj1 = new LearnConstructor("Miru");
        LearnConstructor obj2 = new LearnConstructor("Belayet", "Hossain", 57);

        LearnConstructor obj3 = new LearnConstructor("718 Toylor Ave", "NY", "10473");
    }
}
