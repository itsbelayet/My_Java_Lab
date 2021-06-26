package usefullMethod;

public class Learn_toString {
    String fname,lname;
    int age;
    Learn_toString(String fname, String lname,int age){
        this.fname=fname;
        this.lname=lname;
        this.age=age;
    }
    @Override
    public String toString(){

        return "First Name : "+fname+"/  Last Name : "+lname+"/  Age :"+age;

    }
    public static void main(String[] args) {
        Learn_toString ts =new Learn_toString("Mohammed","Hossain",57);
        System.out.println(ts);
    }
}
