package basicJava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Learn_DataTime {

    public static void main(String[] args) {

        System.out.println("****** Date ********\n");
        Date dt = new Date();
        System.out.println("System Date & Time : " + dt);         // System date & time

        DateFormat df = new SimpleDateFormat("dd/MM/yy");
        String today = df.format(dt);
        System.out.println("Customize Date formate : " + today + "\n");  //Customize Date formate (B'desh)


        System.out.println("****** Time ********\n");
        LocalTime time = LocalTime.now();
        System.out.println("System Time : " +time);             // System time

        DateTimeFormatter tf=DateTimeFormatter.ofPattern("hh:mm:ss");
        String currentTime=time.format(tf);
        System.out.println("Customize Time formate : " +currentTime);   //Customize Time formate

    }
}
