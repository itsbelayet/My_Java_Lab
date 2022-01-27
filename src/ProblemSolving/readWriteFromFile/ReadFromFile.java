package ProblemSolving.readWriteFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("DataTest/Student.txt"); //TextData.txt
        Scanner scanner=new Scanner(file);
        while (scanner.hasNext()){
            String iD=scanner.next();
            String name=scanner.next();
            System.out.println("ID: "+iD+" Name: "+name);
        }
        scanner.close();
    }
}
