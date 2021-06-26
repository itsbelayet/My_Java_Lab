package ProblemSolving;

public class Temp {
    public static void main(String[] args) {
        String str1,str2;
        int x=6,y=4,z=10;
        char a='A',b='B',c='C';
        System.out.println(a+" "+b+" "+c);

        testArray("ABCDEFG");
    }

    static void testArray(String str) {

        char[] cary = str.toCharArray();
        System.out.println(cary);
        for (int i = 0; i < cary.length; i++) {
            System.out.print(cary[i] + " , ");
        }
        for (int i = 0; i < cary.length; i++) {
            int j=cary.length;
            for (int k=j; k<j;k--){
                System.out.print(cary[k]);
            }
        }
    }

}
