package java_7thClass;

public class LearnArray {

    static void DeclareArray1(){
        String [] name={"Mohammed","Belayet","Hossain","Miru"};
        int [] age={25,50,40,65};

        for (String ob:name) {
            System.out.print(ob+",");
        }
        System.out.println();
        System.out.println("-----------------------------");

        for(int ob1:age){
            System.out.print(ob1+",");
        }
        System.out.println();
        System.out.println("***********");
    }
    static void DeclareArray2(){
        String [] name1=new String[4];
        name1[0]="MD";
        name1[1]="Zakir";
        name1[2]="Hossain";
        name1[3]="Hiru";
        for (String ob3:name1) {
            System.out.println(ob3);
        }
        System.out.println("***********");
        int [] salary=new int[4];
        salary[0]=5000;
        salary[1]=4500;
        salary[2]=8000;
        salary[3]=2500;
        for (int sal:salary) {
            System.out.println(sal);
        }

    }

    public static void main(String[] args) {
        DeclareArray1();
        DeclareArray2();
    }
}
