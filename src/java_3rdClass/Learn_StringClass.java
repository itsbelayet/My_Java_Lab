package java_3rdClass;

public class Learn_StringClass {
    public static void main(String[] args) {
        String s1 = "Belayet Hossain";
        String s2 = new String("My name is Belayet Hossain Miru");

        //if(s1==s2){
        if(s1.equals(s2)){
            System.out.println("String are Equal");
        }else {
            System.out.println("String are not Equal");
        }
        System.out.println(s1.length());
        System.out.println(s1.isEmpty());
        System.out.println(s1.contains("Hossain"));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.replace('e','a'));
        System.out.println(s1.replaceAll("Belayet","Mohammed"));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.concat(s2));
        System.out.println(s1.charAt(0));
        System.out.println(s1.indexOf('B'));
        System.out.println(s1.indexOf("Hossain"));

        String [] s3 = s2.split(" ");
        for (String s:s3) {
            System.out.println(s);
        }


    }
}
