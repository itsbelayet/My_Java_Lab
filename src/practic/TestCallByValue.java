package practic;

public class TestCallByValue {

    public static void main(String[] args) {

        CallByValue obj=new CallByValue();
        int x=50;
        System.out.println(x);
        obj.Change(x);
        System.out.println(x);
    }
}
