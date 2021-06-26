package basicJava;

public class Person {

    String fname;
    String lname;
    String nname;
    int age;

    Person (String fname,String lnm,String nname){
        this.fname=fname;       //this. keyword use as because Instance variable "fname" &
                                //local variable "fname" same
        lname=lnm;              // Here Instance variable "lname" & local variable "lnm" is Different
        this.nname=nname;
    }
    Person(String fname,String lnm,String nname,int age){
        this(fname,lnm,nname);      //Call Person constructor
        this.age=age;
    }
    void Display(){

        System.out.println("First Name: "+fname);
        System.out.println("Last Name : "+lname);
        System.out.println("Age  : "+age);
        System.out.println("Nick Name : "+nname);
    }

}
