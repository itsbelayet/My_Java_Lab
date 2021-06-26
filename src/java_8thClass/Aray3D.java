package java_8thClass;

public class Aray3D {

    static void AryMethod(){
        String[][][] ar3d=new String[2][3][4];
        ar3d[0][0][0]="Sl  ";
        ar3d[0][0][1]="Name     ";
        ar3d[0][0][2]="Age  ";
        ar3d[0][0][3]="Salary";

        ar3d[0][1][0]="001 ";
        ar3d[0][1][1]="Miru     ";
        ar3d[0][1][2]="57   ";
        ar3d[0][1][3]="5000  ";

        ar3d[0][2][0]="002 ";
        ar3d[0][2][1]="Hiru     ";
        ar3d[0][2][2]="50   ";
        ar3d[0][2][3]="8000  ";

        //2n Size
        ar3d[1][0][0]="01  ";
        ar3d[1][0][1]="Mohammed ";
        ar3d[1][0][2]="60   ";
        ar3d[1][0][3]="9000";

        ar3d[1][1][0]="02  ";
        ar3d[1][1][1]="Belayet  ";
        ar3d[1][1][2]="59   ";
        ar3d[1][1][3]="7000  ";

        ar3d[1][2][0]="03  ";
        ar3d[1][2][1]="Hossain  ";
        ar3d[1][2][2]="45   ";
        ar3d[1][2][3]="6000  ";

        for (String[][] arr2:ar3d) {
            for (String[] arr1:arr2) {
                for (String arr:arr1) {
                    System.out.print(arr);
                }
                System.out.println();
            }
            System.out.println();       // Creating gap for 2D and 3D
        }
    }
    public static void main(String[] args) {
        Aray3D.AryMethod();
    }
}
