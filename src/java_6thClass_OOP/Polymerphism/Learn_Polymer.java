package java_6thClass_OOP.Polymerphism;

public class Learn_Polymer extends Learn_Override_Overload {
    @Override
    public void mancaneat(){
        System.out.println("Man can eat rice");
    }
    @Override
    public void mancanwalk(){
        System.out.println("Man can walk first");
    }

    public static void main(String[] args) {

        Learn_Polymer lp=new Learn_Polymer();
        lp.mancaneat();
        lp.mancanwalk();

        lp.manhasIdentity("Belayet");
        lp.manhasIdentity("Mohammed age is :",57);
    }
}
