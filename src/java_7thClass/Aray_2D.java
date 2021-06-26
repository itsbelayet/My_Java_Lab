package java_7thClass;

public class Aray_2D {
    static String[][] ar2=new String[3][4];

    public static void main(String[] args) {
        ar2[0][0]="Sl  ";
        ar2[0][1]="Name ";
        ar2[0][2]="Age ";
        ar2[0][3]="Salary";

        ar2[1][0]="001 ";
        ar2[1][1]="Miru ";
        ar2[1][2]="57  ";
        ar2[1][3]="5700";

        ar2[2][0]="002 ";
        ar2[2][1]="Hiru ";
        ar2[2][2]="52  ";
        ar2[2][3]="5200";
        for (String[] ob:ar2) {
            for (String obj:ob) {
                System.out.print(obj+" ");
            }
            System.out.println();
        }
        System.out.println("***************************\n");
        int [][] yr=new int[3][4];

        yr[0][0]=1940;
        yr[0][1]=1950;
        yr[0][2]=1960;
        yr[0][3]=1970;

        yr[1][0]=40;
        yr[1][1]=50;
        yr[1][2]=60;
        yr[1][3]=70;

        yr[2][0]=140;
        yr[2][1]=150;
        yr[2][2]=160;
        yr[2][3]=170;

        for (int[] yer:yr) {
            for (int ye:yer) {
                System.out.print(ye+" ");
            }
            System.out.println();
        }
    }

}
