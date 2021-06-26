package practic;

public class Learn_String {

    public static void main(String[] args) {
        //Declare String different way
        String fname = "Mohammed ";
        String lname = new String("Hossain ");
        String nname = "Miru";

        int a = 947479857;
//        long aa=(long) a;
//        System.out.println(aa+947479857);
        String str1 = Integer.toString(a);

        //.replace
        System.out.println("Replace Method: ****************** \n");
        System.out.println("String str1 = " + str1.replace("3", "0"));
        System.out.println("abadaf".replace("a","e"));
        System.out.println(fname+" after replace 'a' with 'e' "+fname.replace('a','e'));

        //new String
        System.out.println(new String ("Hossain\n"));

        System.out.println("Equals Method: ****************** \n");
        String nicname="Miru";
        if (nname.equals(nicname)){
            System.out.println("It's true\n");
        }else{
            System.out.println("It's false\n");
        }

        System.out.println("Contains Method: ****************** \n");
        if (nname.contains(nicname)){
            System.out.println("It's Contains same value\n");
        }else{
            System.out.println("It's not Contains same value\n");
        }

        System.out.println("Equals Ignore Case Method: ****************** \n");
        nicname="miru";
        if (nname.equalsIgnoreCase(nicname)){
            System.out.println("Same value\n");
        }else{
            System.out.println("Not same value\n");
        }

        System.out.println("Is Empty Method: ****************** \n");
        nicname="";
        if (nicname.isEmpty()){
            System.out.println("This is Empty\n");
        }else{
            System.out.println("This is Not Empty\n");
        }
        System.out.println("Concat Strings: ****************** \n");
        System.out.println(fname.concat(lname)+"\n");

        System.out.println("Convert UpperCase: ****************** ");
        System.out.println(fname.toUpperCase());
        System.out.println("Convert LowerCase: ****************** ");
        System.out.println(lname.toLowerCase()+"\n");

        System.out.println("Starts With & Ends With: ****************** ");
        System.out.println(fname.startsWith("Moh"));
        System.out.println(fname.endsWith("med")+"\n");

        //
        System.out.println("After Joining Name\n");
        String fln=fname+" "+lname+" "+nname;
        System.out.println(fln);

        System.out.println("After split \n");

        String[] myName=fln.split(" ");  //split where space(" ")
        for (String ob:myName) {
            System.out.println(ob);
        }

        String phoneNo="347-547-9857";
        String[] pno=phoneNo.split("-");  // split where "-"

        System.out.println("Before split : "+phoneNo);
        System.out.println("After split :");
        for (String st:pno) {
            System.out.print("  "+st);
        }

//****************************************************

        System.out.println("\n******** Some others Method ***************");

        String name=" Belayet Hossain Miru ";
        char ch=name.charAt(1);

        System.out.println(ch);                         // Return B
        System.out.println(name.charAt(9));             // Return H

        System.out.println(name.codePointAt(1));  // Return Asski value of B

        System.out.println(name.indexOf("Ho"));         // Reture Index value of "Ho"

        System.out.println(name.lastIndexOf("M"));  // Return Index value of last "M"

        System.out.println(name.trim());


        // *******************************************************
        System.out.println("******** String Buffer ***************\n");

        //Creating String Buffer
        StringBuffer sb=new StringBuffer("My Name is");

        System.out.println("Append String: ***************** ");
        //.append
        System.out.println(sb.append(fname));
        System.out.println(sb.append(lname));
        System.out.println(sb.append(nname));

        System.out.println("Reverse String: ****************** ");
        //.reverse
        System.out.println(sb.reverse());

        System.out.println("Deleteing String: *****************");
        System.out.println(sb.reverse());

        System.out.println(sb.delete(10,19));

        System.out.println("Set Length String: *****************");
        sb.setLength(10);
        System.out.println(sb);

    }
}
