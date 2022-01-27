package basicJava;

public class ExceptionHandling {
    //static String name;
    public static void main(String[] args) {

        // Arithmetic Exception
        System.out.println("Before Exception Handling\n********************");
        int a=20;
        try {
            System.out.println(a/0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("*********************\nAfter Exception Handling");

        // Array Index Out of Bounds Exception
        int[] arr=new int[5];
        try {
            arr[4]=500;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This is Finally Block");
        }

        // null Pointer Exception
        String name = null;
        try {
            System.out.println(name.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is Finally Block");
        }
    }
}
