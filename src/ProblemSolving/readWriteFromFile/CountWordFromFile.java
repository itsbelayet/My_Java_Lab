package ProblemSolving.readWriteFromFile;

import java.io.*;
import java.util.Scanner;

public class CountWordFromFile {
    public static void main(String[] args) throws IOException {
        countWord1();
        countWord2();
    }
    // One approach
    public static void countWord1() throws FileNotFoundException {
        File file=new File("DataTest/Student.txt"); //TextData.txt
        Scanner scanner=new Scanner(file);
        int count=0;
        while (scanner.hasNext()){
            scanner.next();
            count=count+1;
        }
        System.out.println("Total Word is : "+count);
        scanner.close();
    }

    // Other approach
    public static void countWord2() throws IOException {
        FileReader fileReader=new FileReader("DataTest/Student.txt"); //TextData.txt
        BufferedReader bufferedReader=new BufferedReader(fileReader);

        int wordCount = 0;
        String data;
        while ((data = bufferedReader.readLine()) != null) {
            System.out.println(data);
            wordCount = wordCount + data.split(" ").length;
        }
        System.out.println("\nTotal Word: " + wordCount);
    }
}
