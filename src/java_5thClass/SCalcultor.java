package java_5thClass;

public class SCalcultor {

    int div;

    public int doDivision(int num1,int num2){

        try{
           this.div=num1/num2;
            System.out.println("Division Value is : "+div);
        }catch (Exception e){
            System.out.println("This is Arithmetic Exception");
        }finally {
            System.out.println("Division is Done");
        }
        return div;

    }

    public static void main(String[] args) {
        SCalcultor sc = new SCalcultor();
        sc.doDivision(30,4);
        System.gc();    // Gurbege collection
    }
}
