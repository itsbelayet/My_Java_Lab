package java_7thClass;

public class TestArray {
    //Single dimensional array
    //Array Declaring
    //1st Way
    int[] age ={12,25,85,30,17,90}; //Declare and Initializing

    String [] name = new String[3]; //Only Declaring
    static int[] salary=new int[4];        //Only Declar=ing

    public static void main(String[] args) {

        TestArray obj= new TestArray();
        obj.name[0]="Miru";
        obj.name[1]="Hiru";
        obj.name[2]="Moni";
        for (String nm :obj.name) {
            System.out.println(nm);
        }

        System.out.println("*************************\n");
        TestArray.salary[0]=2000;
        TestArray.salary[3]=5000;
        TestArray.salary[1]=7000;
        TestArray.salary[2]=3000;
        for (int slr :TestArray.salary) {
            System.out.println(slr);
        }
        System.out.println("********************\n");

        TestArray.Array2d();    //Calling Method
    }
    static void Array2d(){
        String [][] country=new String[3][4];
        country[0][0]="Sl   ";
        country[0][1]="Country     ";
        country[0][2]="Capital     ";
        country[0][3]="Population";

        country[1][0]="0001 ";
        country[1][1]="Bangladesh  ";
        country[1][2]="Dhaka       ";
        country[1][3]="16000000 ";

        country[2][0]="0002 ";
        country[2][1]="USA         ";
        country[2][2]="Washington  ";
        country[2][3]="23000000 ";

        for (String[] cy:country ) {
            for (String cty:cy) {
                System.out.print(cty);
            }
            System.out.println();
        }
    }
}
