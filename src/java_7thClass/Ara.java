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
        int[] a={10,20,30,40,50};
        //int x=a.length;
        a[0]=a[a.length-1];
        System.out.println("Test Array "+a[0]);

        MethodAra();
        System.out.println("**********************\n");

        Ara mr = new Ara();
        mr.MethodAraInt();
    }
}
