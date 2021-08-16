package practic;

public class ClassInterface implements CsInterface {
    public void CsIface() {
        System.out.println("This is Class Interface");
    }
}

interface CsInterface {
    String name = null;

    void CsIface();

}

class TestClass extends ClassInterface {
    public static void main(String[] args) {
//        ClassInterface obj=new ClassInterface();
//        obj.CsIface();
        TestClass ob = new TestClass();
        ob.CsIface();
    }
}