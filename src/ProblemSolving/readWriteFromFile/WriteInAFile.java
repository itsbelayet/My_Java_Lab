package ProblemSolving.readWriteFromFile;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class WriteInAFile {
    public static void main(String[] args) {
        int id;
        String name;
        try{
            Formatter formatter=new Formatter("DataTest/Student.txt");
            Scanner input=new Scanner(System.in);
            System.out.print("How many Student ?: ");
            int num=input.nextInt();

            for (int i=1; i<=num;i++){
                System.out.print("Enter Student ID and Name: ");
                id=input.nextInt();
                name=input.next();
                formatter.format("%s %s \r\n",id,name);
            }
            formatter.close();
            input.close();

        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}
