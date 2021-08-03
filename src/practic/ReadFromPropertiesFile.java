package practic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadFromPropertiesFile {

    public static void main(String[] args) throws IOException {

        Properties properties=new Properties();
        InputStream inputStream=new FileInputStream("DataTest/Data.properties");
        properties.load(inputStream);

        System.out.println(properties.getProperty("Name"));
        System.out.println(properties.getProperty("UserID"));
        System.out.println(properties.getProperty("UserPassword"));
        System.out.println(properties.getProperty("User"));
        System.out.println(properties.getProperty("Password"));
        System.out.println(properties.getProperty("RollNo"));
        System.out.println(properties.getProperty("StatementNo"));

    }


}
