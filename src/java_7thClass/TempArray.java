package java_7thClass;

public class TempArray {
//    String [][] table =new String[3][4];
    int [][] tble=new int[3][4];

    public static void main(String[] args) {
        TempArray obj1=new TempArray();
        obj1.aMethod();
    }
    void aMethod(){
        TempArray obj=new TempArray();
        obj.tble[0][0]=1920;
        obj.tble[0][1]=1930;
        obj.tble[0][2]=1940;
        obj.tble[0][3]=1950;

        obj.tble[1][0]=2001;
        obj.tble[1][1]=3001;
        obj.tble[1][2]=4001;
        obj.tble[1][3]=5001;

        obj.tble[2][0]=1002;
        obj.tble[2][1]=1003;
        obj.tble[2][2]=1004;
        obj.tble[2][3]=1005;


        for (int [] oj:obj.tble) {
            for (int ob:oj) {
                System.out.print(ob+" ");
            }
            System.out.println();
        }

    }

}
