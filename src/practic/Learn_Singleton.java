package practic;

public class Learn_Singleton {

    //1.Create Private Static Object
    private static Learn_Singleton instanceOfClass=new Learn_Singleton();

    //2.Create Private Constructor
    private Learn_Singleton(){
        String name="This is Private Method of Singleton Constructor";
        System.out.println(name);
    }

    //3.Create public Return Type Method
    public static Learn_Singleton getInstance(){
        return instanceOfClass;
    }
    void methodOfSingleton(){
        System.out.println("This is Regular Method of Singleton Class");
    }

}
