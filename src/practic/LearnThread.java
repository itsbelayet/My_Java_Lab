package practic;

public class LearnThread {
    public static void main(String[] args) {
        AA obj=new AA();
        obj.run();

        for (int i=0; i<5; i++){
            System.out.println("Main");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
class AA extends Thread{
    @Override
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println("Sub");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}