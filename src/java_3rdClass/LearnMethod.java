package java_3rdClass;

public class LearnMethod {

    //Return type Method without Parameter
    public static int doSum(){
        int num1=40;
        int num2=30;
        int total=num1+num2;
        System.out.println(total);
        return total;
    }

    //Return type Method with Parameter
    public static int doCalculate(int number1,int number2){     //This is Static Method
        int nm1=number1;                                        //Call by Class Name
        int nm2=number2;
        int tot=nm1-nm2;
        System.out.println(nm1+" - "+nm2+" = "+tot);
        return tot;
    }

    //Return type Non-Static Method with Parameter
    public int doMultiply(int n1,int n2){                       //This is Non-Static Method
        int t=n1*n2;                                            //Call by Object Name
        System.out.println(n1+" * "+n2+" = "+t);
        return t;
    }

    //Non-Return type Static Method without Parameter
    public static void myInfo(){
        String myname="Belayet";
        int myage=57;
        System.out.println("My name is "+myname+" age is "+myage);
    }

    //Non-Return type Static Method with Parameter
    public static void myProfile(String mfname,int mage){
        System.out.println("My Profile is "+mfname+" age is "+mage);
    }

    //Non-Return type Non-Static Method with Parameter
    public static void myfile(String mfname,String madd,int mage){
        System.out.println("My Profile is "+mfname+" Address "+madd+" age is "+mage);
    }

    public static void main(String[] args) {
        LearnMethod.doSum();
        LearnMethod.doCalculate(25,10);                         //Call by Class Name

        LearnMethod ob = new LearnMethod();                     //Call by Object Name
        ob.doMultiply(25,5);
        System.out.println("\n==============================\n");

        LearnMethod.myInfo();
        LearnMethod.myProfile("Mohammed",57);
        LearnMethod ob1 = new LearnMethod();
        ob1.myfile("Miru","Taylor Ave",57);

    }
}
