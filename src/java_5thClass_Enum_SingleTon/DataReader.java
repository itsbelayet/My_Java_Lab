package java_5thClass_Enum_SingleTon;

import java.io.BufferedReader;
import java.io.FileReader;

public class DataReader {
    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        //String filepath="C:\\Users\\itsbe\\IdeaProjects\\Home_Test\\TestData";
        String filepath="D:\\Intellij_Projects\\My_Java_Lab\\DataTest\\TextData.txt";
        int wordCount=0;
        try{
            fileReader = new FileReader(filepath);
            bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data=bufferedReader.readLine()) != null){
                System.out.println(data);
                wordCount=wordCount+data.split(" ").length;
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
        System.out.println("Total Word: "+wordCount);
    }
}
