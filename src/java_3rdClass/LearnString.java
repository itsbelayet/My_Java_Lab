package java_3rdClass;

public class LearnString {

    public static void main(String[] args) {

        String fname="Mohammed";
        String mname=" Belayet ";
        String lname="Hossain";
        String tname=(fname.concat(mname).concat(lname));   //Joining three String

        System.out.println(fname.substring(0,3));

        System.out.println(tname);

        System.out.println(tname.length());                 //Counting total character with space
        System.out.println(tname.equals("Belayet Hossain"));//Compare with String
        System.out.println(tname.charAt(9));                // 9th number character
        System.out.println(tname.substring(9));             //Trim previous 9 character
        System.out.println(tname.substring(9,16));          //Display 9th to 16th character
        System.out.println(tname.toUpperCase());            //Convert to Upper Case
        System.out.println(tname.toLowerCase());            //Convert to Lower Case
        System.out.println("   My Name is Miru  ".trim());  //Trim the blank space outside of the Text

        System.out.println("\n===================================\n");

        //Reverse a String: 2 way
        //1st one: With loop

        String name = "MIRU";
        int len=name.length();
        String rname="";

        for (int i=len-1; i>=0; i--){
            rname=rname + name.charAt(i);
        }
        System.out.println("MIRU Reverse is : "+rname);

        //2nd one:
        String nm="BELAYET";
        StringBuffer obj = new StringBuffer(nm);
        System.out.println("BELAYET reverse is : "+obj.reverse());

    }
}
