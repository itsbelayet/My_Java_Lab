package java_5thClass;

public class LearnEnum {

    public enum LEnum {
        MIRU, HIRU, MONI, REKHA;
    }


    public static void main(String[] args) {
        Color.DisplayColor();
        System.out.println(LEnum.MIRU);
        Color col = Color.VIOLET;
        System.out.println(col);

    }
}
