package basicJava;

public class Static_Block {

    public static void main(String[] args) {
        System.out.println("This is Main Method");
    }

    static {
        System.out.println("\nThis is Static Block, So It's run before Main Method\n");
    }
}
