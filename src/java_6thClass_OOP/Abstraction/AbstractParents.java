package java_6thClass_OOP.Abstraction;

public abstract class AbstractParents {

    AbstractParents(){              // Constructor can create of a Abstract Class
        System.out.println("This is Constructor of AbstractParents");
    }

    public abstract void women();   // Method Implement to Learn_Abstract Class

    public void girl(){             // Method Overriding to Learn_Abstract Class
        System.out.println("Girls are Women");
    }

    // Constructor can created
    // Regular Method can created as well as abstract Method

}
