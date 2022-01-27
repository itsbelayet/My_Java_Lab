package java_2nClass_Custing_Scanner_NestedClass;

public class Method_Block {
    // Block must be Create inside of a method and
    // to execute the block have to call the method.

    public static void main(String[] args) {
        Display();              //Method Call
        Method_Block.Display(); //Method Call by class name

        Method_Block disobj=new Method_Block();
        disobj.Display1();      //Method Call by Object Name
    }

    public static void Display(){ //This is static Method
        int age=57;
        String name="Belayet";
        System.out.println("My Name is "+name+" and age is "+age);
        {
            int salary=5000;
            String nicName="Miru";
            System.out.println("My Nic Name is "+nicName+" Salary is "+salary);
        }
    }
    public void Display1(){
        int bornyear=1964;
        String fName="Mohammed";
        System.out.println("My First Name is "+fName+" and Born Year "+bornyear);
        {
            String lName="Hossain";
            System.out.println("My Last Name is "+lName);
        }
    }
}
