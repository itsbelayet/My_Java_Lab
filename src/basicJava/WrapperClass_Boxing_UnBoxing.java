package basicJava;

public class WrapperClass_Boxing_UnBoxing {

    // Wrapper class are used to convert primitive data into object and object into primitive data.

    public static void main(String[] args) {

        int i = 5;  // Primitive datatype
        Integer ii = new Integer(i);    // Boxing or Wrapping   or
        Integer value = i;              // AutoBoxing
        System.out.println("Boxing Examp : " + ii + " " + value);

        int j = ii.intValue();          // UnBoxing or UnWrapping
        int k = value;                  // AutoUnBoxing
        System.out.println("UnBoxing Examp : " + j + " " + k);

        System.out.println("\n**************************************\n");

        String str = "123456";
        int n = Integer.parseInt(str);  // Unboxing using parseInt Method
        int val = Integer.valueOf(str); // Unboxing useing valueOf Method

        System.out.println(n+"  Convert String to Int : " + val);

//        System.out.println("******* String to Number ********\n");
//        String num = "8539";
//        int number = Integer.valueOf(num);
//        System.out.println(number + 1);
//
//        System.out.println("******* Number to String ********\n");
//        System.out.println(Integer.toString(number + 1));
//
//        System.out.println("******* String to ParseInt ********\n");
//        System.out.println(Integer.parseInt(num + 1));


    }
}
