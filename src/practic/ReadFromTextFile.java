package practic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromTextFile {

    public static void main(String[] args) throws IOException {
        FileReader fileReader=new FileReader("DataTest/EnglishLearningSide.txt");
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
    }
}
