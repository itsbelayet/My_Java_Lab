package basicJava;

public class InnerClass {
    public static void main(String[] args) {
        OutClass oc;
        oc = new OutClass();
    }
    static class OutClass{
        int x;
        class InClass{
            int y;
        }
    }
}

