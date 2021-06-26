package database_Practic;

public class TestDemo {
    public static void main(String[] args) {
        DataManipulation dm=new DataManipulation();
        try{
            dm.readData();              // Read Data from txt file
            dm.saveData();              // Save Data to mysql table
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
