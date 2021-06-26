package basicJava;

public class VarargsMethod {

    public void add(int ... num){
        int sum=0;
        for (int x:num) {
            sum=sum+x;
        }
        System.out.println("Total Summation : "+sum);
    }

    public static void main(String[] args) {
        VarargsMethod ob=new VarargsMethod();
        ob.add(25,50);
        ob.add(50,75,65);
        ob.add(125,250,380,560);
    }
}
