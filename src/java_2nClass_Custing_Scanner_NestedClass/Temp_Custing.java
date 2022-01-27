package java_2nClass_Custing_Scanner_NestedClass;

public class Temp_Custing {

    public static void main(String[] args) {

        String sint = "My age 57, Year of Birth 64, Current year 2021";
        System.out.println("Before Convert Mix String: "+sint);
        sint = (sint.replaceAll("\\D+", ""));
        System.out.println("After Convert int String : "+sint);
        int valu=Integer.parseInt(sint);
        System.out.println(valu+1);


//        int sint1= Integer.parseInt(sint);
//        System.out.println("After Convert int        : "+ sint1+" Add 9 = "+(sint1+9));
//
//        System.out.println("****************************\n");
//        String sint2 = "347-547-9857";
//        System.out.println("Before Convert Mix String: " + sint2);
//        String sint3 = sint2.replaceAll("\\D+", "");
//        System.out.println("After Convert int String : " + sint3);
//
//        long ints = Long.parseLong(sint3);
//        System.out.println("After Convert long value : " + ints + " Add 3 = " + (ints + 3));

    }
}
