package java_6thClass_OOP.Inheritance;

public class Customer{
    public static void main(String[] args) {
        Bank bank=new Bank();
        int bankrate=bank.interestRate();
        System.out.println("Bank Interest Rate : "+bankrate);

        IFIC ific=new IFIC();
        int ificrate=ific.interestRate();
        System.out.println("IFIC Interest Rate : "+ificrate);

        UCBL ucbl=new UCBL();
        int ucblrate=ucbl.interestRate();
        System.out.println("UCBL Interest Rate : "+ucblrate);
    }
}
