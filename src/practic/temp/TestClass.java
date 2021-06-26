package practic.temp;

public class TestClass {
    int sal;
    public int salary(int sal){
        this.sal=0;
        System.out.println(sal);
        return sal;
    }

    public static void main(String[] args) {
        TestClass ts =new TestClass();
        ts.salary(5000);
    }
}
