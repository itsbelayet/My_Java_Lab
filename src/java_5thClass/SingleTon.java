package java_5thClass;

public class SingleTon {
    private static SingleTon instance=new SingleTon();
    private SingleTon(){}

    public static SingleTon getinstance(){
        return instance;
    }

     public static void Display(){
        System.out.println("This is Single Ton Method");
    }

}