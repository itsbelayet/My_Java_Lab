package java_8thClass;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {

        int [] num=new int[10];
        Random rdom=new Random(5);        // Starting Number that is "5"
        for (int i=0; i<num.length; i++){
            num[i]=rdom.nextInt(30);    // Ending Number that is "30"
            System.out.println(num[i]);
        }
        System.out.println("********** Rendom Number Generating ***********\n");
        String renNum= RandomStringUtils.randomNumeric(5);
        System.out.println(renNum+"\n");
        System.out.println("********** Rendom Alphabet Generating ***********\n");
        String renAlp=RandomStringUtils.randomAlphabetic(5);
        System.out.println(renAlp);
        System.out.println("********** Rendom AlphaNumeric Generating ***********\n");
        String renAlpNum=RandomStringUtils.randomAlphanumeric(5);
        System.out.println(renAlpNum);

    }

}
