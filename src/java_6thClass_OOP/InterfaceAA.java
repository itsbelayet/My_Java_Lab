package java_6thClass_OOP;

public interface InterfaceAA {

    // In interface Variable can't be Declare only.
    // It should be Declare and Initialize at the same time.
    // Method body can't be used in a Non-Static void Method

    String name="Belayet";
    int age=57;

    // Method body can't be used in a Non-Static void Method
    void IntAA1();
    void IntAA2();

    // This is regular Method
    public static void IntAA3(){
        System.out.println("This is Regular Method of InterfaceAA");
    }

    public static int IntAA4(int salary, int month){
        int ysalary=salary*month;
        System.out.println("Yearly Salary is : "+ysalary);
        return ysalary;
    }

    public static void main(String[] args) {
            IntAA4(500,5);
    }
}
