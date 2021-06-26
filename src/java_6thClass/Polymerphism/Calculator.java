package java_6thClass.Polymerphism;

public class Calculator {

    public void DoSum(int num1,int num2){
        int total=num1+num2;
        System.out.println("This is two parametrized Method Overloading : "+total);
    }
    public void DoSum(int num1,int num2,int num3){
        int total=num1+num2+num3;
        System.out.println("This is hree parametrized Method Overloading : "+total);
    }


    public static void main(String[] args) {
        System.out.println("This is Method Overloading");
        Calculator obj=new Calculator();
        obj.DoSum(25,50);
        obj.DoSum(25,75,60);
        System.out.println("*******************************\n");


    }

}
