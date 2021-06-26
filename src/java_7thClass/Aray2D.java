package java_7thClass;

public class Aray2D {
    public static void main(String[] args) {

        String[][] table = {
                {"Sl", "Name", "Age", "Salary"},
                {"01", "Miru", "57 ", "8000  "},
                {"02", "Hiru", "50 ", "9000  "},
                {"03", "Moni", "60 ", "7500  "},
                {"04", "Reka", "58 ", "9500  "}
        };

        for (String[] obj : table) {
            for (String ob : obj) {
                System.out.print(ob+" ");
            }
            System.out.println();
        }

    }
}
