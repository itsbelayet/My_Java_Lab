package database_Practic;

public class Test_Read_Insert_Display {
    public static void main(String[] args) {
        Read_Insert_Display emp = new Read_Insert_Display();
        try{
           emp.readData();              // Read Data from "src/emp_data.txt" file
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
