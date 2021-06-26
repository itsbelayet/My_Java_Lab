package basicJava;

public class WrapperClass {

    // Wrapper class are used to convert primitive data into object and object into primitive data.

    public static void main(String[] args) {

        System.out.println("******* String to Number ********\n");
        String num="8539";
        int number=Integer.valueOf(num);
        System.out.println(number+1);

        System.out.println("******* Number to String ********\n");
        System.out.println(Integer.toString(number));

        System.out.println("******* String to ParseInt ********\n");
        System.out.println(Integer.parseInt(num));

    }
}
