package practic;

public class Array2D {

    static int [] age={101,102,103};

    static void ArrayMethod(){
        String[][] name = new String[3][4];
        name[0][0]="Sl  ";
        name[0][1]="Name ";
        name[0][2]="Age  ";
        name[0][3]="Salary";

        name[1][0]="001 ";
        name[1][1]="Miru";
        name[1][2]="57  ";
        name[1][3]="5000";

        name[2][0]="002 ";
        name[2][1]="Hiru";
        name[2][2]="50  ";
        name[2][3]="8000";
        for (String [] obj:name) {
            for (String ob:obj) {
                System.out.print(ob);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Array2D.ArrayMethod();

        for (int ob:Array2D.age) {
            System.out.println(ob);
        }

    }
}
