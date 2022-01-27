package java_6thClass_OOP;

public class AbstractChild extends AbstractClass implements InterfaceAABB {
    //Call Abstract Method of AbstractClass
    //Normal Method of AbstractClass can't be called. It can call by creating object of Abstract Class
    //All the Method of Interface will come

//    void testMethod(){
//        System.out.println("This is test method");
//    }

    public void AbsAA1() {
        System.out.println("This is Abstract Method of Abstract Class");
    }

    public void AbsAA2() {
        System.out.println("This Also Abstract Method of Abstract Class");
    }

    public void IntAA1() {
        System.out.println("Method of Interface AA1");
    }

    public void IntAA2() {
        System.out.println("Method of Interface AA2");
    }

    public void IntBB1() {
        System.out.println("Method of Interface BB1");
    }

    public void IntBB2() {
        System.out.println("Method of Interface BB2");
    }

    public void IntAABB1() {
        System.out.println("Method of Interface AABB1");
    }

    public void IntAABB2() {
        System.out.println("Method of Interface AABB2");
    }
}
