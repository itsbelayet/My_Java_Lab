package java_7thClass;

public class LearnArray2D {

    static String [][] info = new String[3][4];

    public static void main(String[] args) {

        LearnArray2D.info[0][0]="SL   ";
        LearnArray2D.info[0][1]="Name ";
        LearnArray2D.info[0][2]="Age  ";
        LearnArray2D.info[0][3]="Salary";

        LearnArray2D.info[1][0]="001  ";
        LearnArray2D.info[1][1]="Miru ";
        LearnArray2D.info[1][2]="57   ";
        LearnArray2D.info[1][3]="$5000";

        LearnArray2D.info[2][0]="002  ";
        LearnArray2D.info[2][1]="Moni ";
        LearnArray2D.info[2][2]="60   ";
        LearnArray2D.info[2][3]="$8000";
       for (String[] ifo:LearnArray2D.info) {
           for (String iof:ifo) {
               System.out.print(iof);
           }
           System.out.println();
        }
        System.out.println("***********************\n");

        String[][] sName = new String[5][4];

        sName[0][0] = "Sl  ";
        sName[0][1] = "FName   ";
        sName[0][2] = "LName   ";
        sName[0][3] = "Address ";

        sName[1][0] = "001 ";
        sName[1][1] = "Mohammed";
        sName[1][2] = "Hossain ";
        sName[1][3] = "Jamaica ";

        sName[2][0] = "002 ";
        sName[2][1] = "Md      ";
        sName[2][2] = "Zakir   ";
        sName[2][3] = "Taylor A";

        sName[3][0] = "003 ";
        sName[3][1] = "Mamun   ";
        sName[3][2] = "Sarker  ";
        sName[3][3] = "Bronx   ";

        sName[4][0] = "004 ";
        sName[4][1] = "Ismat   ";
        sName[4][2] = "Begum   ";
        sName[4][3] = "Manhartn";

        for (String[] std:sName) {
            for (String stn:std) {
                System.out.print(stn+" ");
            }
            System.out.println();
        }


    }

}
