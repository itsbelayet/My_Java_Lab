package practic.temp;

public interface Car_Interface {
    /*  Object              : Object can't create of a interface
        Variable Declaration : Declaration and Initializ should be same time.

        Abstract Method :   Interface contain abstract method. It's has no body. It should Non-return type.
                            Use only public specifier.

        Regular Method :   It's has body. It should be return type. Use public static sepcifier.

        Implementation : One Interface extend another Interface but
                         One Interface can't implement another Interface
                         Only Class can implement one or multiple Interface

                         Exam: public class TestClass implement Car_interface,other_interface
                               public interface BoostEngine extends Autopilot

                         public interface Car {
                            public interface NewCar{    // Nested Interface
                                public void carRoop();
                            }
                         }
       How to call Nested Interface:
                           public class Tesla implements Car, Car.NewCar {
                           // Here Car is an interface and
                           // Car.NewCar is also an interface

        Method Casting  : public class GeneralMotor extends ModernCar implements Car
                          ModernCar mc = new GeneralMotor();
                          ((GeneralMotor) mc).startCar();


     */

    String name = "Miru";
    int age = 57;

    public void carBreak();         // This is abstract Method

    public static int salary() {     // This is regular Method
        int sal = 0;
        return sal;
    }

}
