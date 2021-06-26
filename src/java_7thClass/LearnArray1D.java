package java_7thClass;

public class LearnArray1D {

    // Declare an Global Array
    static int[] stID = {101, 102, 103, 104, 105, 106};

    public static void main(String[] args) {
        // Declare an Local Array
        String[] stAdd = new String[5];
        stAdd[0]="New York";
        stAdd[1]="Dhaka";
        stAdd[2]="Florida";
        stAdd[3]="Taxes";
        stAdd[4]="Pennsylvania";

        //To print local Array value
        System.out.println(stAdd[1]);
        for (String st:stAdd){
            System.out.println(st);
        }
        //To print Global Array
        for (int sID: LearnArray1D.stID){
            System.out.println(sID);
        }
        //To print Array Length
        System.out.println(stAdd.length);
        System.out.println(LearnArray1D.stID.length);

    }
}
