package practic;

public class Array3D {

    int[][][] arr3 =new int[2][3][4];

    void TemAry(){
        arr3[0][0][0]=1910;
        arr3[0][0][1]=1920;
        arr3[0][0][2]=1930;
        arr3[0][0][3]=1940;

        arr3[0][1][0]=10;
        arr3[0][1][1]=20;
        arr3[0][1][2]=30;
        arr3[0][1][3]=40;

        arr3[0][2][0]=100;
        arr3[0][2][1]=200;
        arr3[0][2][2]=300;
        arr3[0][2][3]=400;
        //****** 3D *******
        arr3[1][0][0]=1000;
        arr3[1][0][1]=2000;
        arr3[1][0][2]=3000;
        arr3[1][0][3]=4000;

        arr3[1][1][0]=1010;
        arr3[1][1][1]=2020;
        arr3[1][1][2]=3030;
        arr3[1][1][3]=4040;

        arr3[1][2][0]=1001;
        arr3[1][2][1]=2002;
        arr3[1][2][2]=3003;
        arr3[1][2][3]=4004;

        for (int[][] arr2:arr3) {
            for (int[]arr1:arr2) {
                for (int arr:arr1) {
                    System.out.print(arr+" ");
                }
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        Array3D a = new Array3D();
        a.TemAry();

    }

}
