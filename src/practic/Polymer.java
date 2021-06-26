package practic;

public class Polymer {
    void Dosum(int num1,int num2){
        int tot=num1+num2;
        System.out.println(tot);
    }
    void Dosum(int age,int nm2,int num3){
        int tot=age+nm2+num3;
        System.out.println(tot);
    }

    public static void main(String[] args) {
        Polymer obj=new Polymer();
        obj.Dosum(10,15);
        obj.Dosum(15,25,35);
    }

}
