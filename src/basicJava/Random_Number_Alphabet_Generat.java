package basicJava;

import org.apache.commons.lang3.RandomStringUtils;

public class Random_Number_Alphabet_Generat {
    public static void main(String[] args) {
        String ranAlphabet= RandomStringUtils.randomAlphabetic(5);
        System.out.println("This is Random Alphabet    : "+ranAlphabet);
        String ranNumber=RandomStringUtils.randomNumeric(5);
        System.out.println("This is Random Numeric     : "+ranNumber);
        String ranAlphaNumeric=RandomStringUtils.randomAlphanumeric(5);
        System.out.println("This is Random AlphaNumeric: "+ranAlphaNumeric);
    }
}
