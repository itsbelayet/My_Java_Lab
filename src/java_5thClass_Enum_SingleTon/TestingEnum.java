package java_5thClass_Enum_SingleTon;

public class TestingEnum {
    public static void main(String[] args) {
        Coffee coffee = new Coffee(CupSize.SMALL);
        System.out.println(coffee);
        //Using the Enum
        CupSize cup = CupSize.SMALL;
        System.out.println("Value of cup : "+cup);
        //Coffee coffee = new Coffee(CupSize.SMALL);          //
        //System.out.println("");
        System.out.println("Volume is : "+cup.getVolume());
        System.out.println(cup.getDetails());
        System.out.println("*********************\n");

        //Using the Enum as a member variable inside Coffee

        Coffee coffee1 = new Coffee(CupSize.MEDIUM);
        System.out.println(coffee1);
       // System.out.println("Volume is "+coffee1.getCupSize().getVolume());

        //System.out.println(coffee1.getCupSize().getDetails());
        System.out.println("*********************\n");

        Coffee coffee2 = new Coffee();
        coffee2.setCupSize(CupSize.LARGE);
        System.out.println(coffee2);
        System.out.println(coffee2.getCupSize().getDetails());

    }

}
