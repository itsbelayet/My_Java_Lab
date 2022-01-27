package misc;

public class Parents {
    int a;
    String st;
    void testMethod(){
        this.a=500;
        this.st="Mohammed";
        System.out.println(this.st+" Salary is : "+this.a);
    }
    public void calculator(int i, String st){
        System.out.println(st+" Yearly Salary is : "+i*12);
    }

    public void age(){
        int ag=57;
    }
    public void salary(){
        int sal=5900;
    }

}
