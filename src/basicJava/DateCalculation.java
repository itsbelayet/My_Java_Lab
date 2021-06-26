package basicJava;

public class DateCalculation {
    public static void main(String[] args) {
        String toaaysDate = "May,2021";
        String joiningDate = "October,1989";
        String[] tMonth = toaaysDate.split(",");
        String[] jMonth = joiningDate.split(",");
        String curMonth = tMonth[0];
        String jonMonth = jMonth[0];
        System.out.println(tMonth[0]+", "+tMonth[1]);
        System.out.println(jMonth[0]+", "+jMonth[1]);

    }

}
