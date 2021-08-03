package basicJava;


public class JavaTest {
    public static void main(String[] args) {
        JTest.jvTest();
        TestJava tj2=new TestJava();
        tj2.carColor("Blue");
        
    }
}


class JTest{                // Sub Class
    static String name;
    static void jvTest(){
        System.out.println(name);
    }
}