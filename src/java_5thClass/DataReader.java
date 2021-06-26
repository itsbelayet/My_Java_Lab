package java_5thClass;

import java.io.BufferedReader;
import java.io.FileReader;

public class DataReader {

    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String filepath="C:\\Users\\itsbe\\IdeaProjects\\Home_Test\\TestData";
        try{
            fileReader = new FileReader(filepath);
            bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data=bufferedReader.readLine()) != null){
                System.out.println(data);
            }
        }catch (Exception e){
            System.out.println("File Not Found Exception");
        }finally {
            try{
                fileReader.close();
                bufferedReader.close();
            }catch (Exception e){
                System.out.println("File Already Close");
            }
        }
    }
}
