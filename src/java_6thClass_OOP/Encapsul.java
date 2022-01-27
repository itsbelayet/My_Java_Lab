package java_6thClass_OOP;

public class Encapsul {

    private String myname;
    private String yourname;
    private int age;
    private int salary;

    //Get Method and  Set Method

    public String getYourname() {
        return yourname;
    }

    public void setYourname(String yourname) {
        this.yourname = yourname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // Different way
    // Method Name can be any one

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void nameSt(String myname) {
        this.myname = myname;
    }

    public String nameGt() {
        return myname;
    }
}
