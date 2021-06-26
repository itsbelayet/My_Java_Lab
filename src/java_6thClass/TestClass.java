package java_6thClass;

import java_6thClass.Polymerphism.Calculator;
import java_6thClass.Polymerphism.Toyota;

public class TestClass {
    public static void main(String[] args) {

        // Test Abstraction and Interface
        System.out.println("Abstraction and Interface testing\n");
        AbstractChild obj1 = new AbstractChild();
        obj1.AbsAA1();
        obj1.AbsAA2();
        obj1.AbsAA3();  // This is Regular Method
        obj1.IntAA1();
        obj1.IntAA2();
        obj1.IntBB1();
        obj1.IntBB2();
        obj1.IntAABB1();
        obj1.IntAABB2();

        System.out.println("***** Method Casting *************\n\n");
        //Another way to creat object   //Method Casting
        InterfaceAA ifAA = new AbstractChild();
        ifAA.IntAA1();
        ifAA.IntAA2();
        ((AbstractChild) ifAA).AbsAA1();
        ((AbstractChild) ifAA).AbsAA2();
        ((AbstractChild) ifAA).AbsAA3();

        InterfaceBB ifBB=new AbstractChild();
        ifBB.IntBB1();
        ((AbstractChild) ifBB).AbsAA1();

        System.out.println("*********************************\n\n");

        //Encapsulation Test
        System.out.println("Encapsulation Testing\n");

        Encapsul encp = new Encapsul();
        encp.setYourname("Miru");
        System.out.println("My name is " + encp.getYourname());
        encp.setAge(57);
        System.out.println("My age is " + encp.getAge());

        encp.nameSt("Belayet");
        System.out.println(encp.nameGt());
        encp.setSalary(5000);
        System.out.println(encp.getSalary());

        System.out.println("***********************************\n\n");
        //Polymerphism
        //Method Overloading
        System.out.println("Polymerphism Testing");
        Calculator obj3 = new Calculator();
        obj3.DoSum(125, 225);
        obj3.DoSum(25, 75, 85);

        System.out.println("*********************************\n");
        //Method Overriding
        Toyota obj2 = new Toyota();
        obj2.Camera360();
    }
}
