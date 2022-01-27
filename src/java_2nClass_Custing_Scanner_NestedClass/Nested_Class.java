package java_2nClass_Custing_Scanner_NestedClass;

public class Nested_Class {

    public static void main(String[] args) {
        ChildClass classObj=new ChildClass();
        System.out.println("Computer Name: "+classObj.comName);     // Call by Object Name
        System.out.println("Computer Price: "+ ChildClass.comPrice); // Call by Sub-class Name due to property
                                                                    //Decler as static
    }

    public static class ChildClass {
        String comName="Epsion";
        static int comPrice=2000;
    }

}
