package java_7thClass;

public class Ara {
    //Single dimention

    static String[] name = new String[3];

    static void MethodAra() {
        Ara.name[0] = "Miru";
        name[1] = "Hiru";
        name[2] = "Moni";
        for (String nm : name) {
            System.out.println(nm);
        }
    }

    void MethodAraInt() {
        int[] age = {25, 50, 30, 80};
        for (int ag : age) {
            System.out.println(ag);
        }
    }

    public static void main(String[] args) {
        MethodAra();

        System.out.println("**********************\n");

        Ara mr = new Ara();
        mr.MethodAraInt();
    }
}
