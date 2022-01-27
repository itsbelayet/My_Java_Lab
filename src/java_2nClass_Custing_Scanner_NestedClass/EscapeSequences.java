package java_2nClass_Custing_Scanner_NestedClass;

public class EscapeSequences {
    public static void main(String[] args) {
        //  \n for New line
        System.out.println("Name :\tMohammed Belayet Hossain \"Miru\"\n718 Taylor Avenue,\b \nBronx NY 10473");
        System.out.println("My Date of Birth : 08\\16\\1964");

        //Example of Nested Class
        Nested_Class.ChildClass obj = new Nested_Class.ChildClass();
        System.out.println("\nComputer Name: "+obj.comName);                    // Call by Object Name from other Class
        System.out.println("Computer Price: "+Nested_Class.ChildClass.comPrice);// Call by Class Name from other Class
    }

}
