package usefullMethod;

public class TestMethods {
    public static void main(String[] args) {

        Learn_toString ts =new Learn_toString("Belayet","Hossain",57);

        // One approach
        System.out.println(new Learn_toString("Zakir","Hossain",50));

        // Another approach
        System.out.println(ts);

        // Another approach
        System.out.println(ts.toString());
    }
}
