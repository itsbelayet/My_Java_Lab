package practic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromTextFile {

    public static void main(String[] args) throws IOException {
        String tempContainer;
        String finalContainer = "";

        FileReader fileReader = new FileReader("DataTest/EnglishLearningSide.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((tempContainer = bufferedReader.readLine()) != null) {
            if (finalContainer.equals("")) {
                finalContainer = finalContainer + tempContainer;
            } else {
                finalContainer = finalContainer + "\n" + tempContainer;
            }
        }
        System.out.println(finalContainer);

    }
}
