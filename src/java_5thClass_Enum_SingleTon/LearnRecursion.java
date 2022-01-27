package java_5thClass_Enum_SingleTon;

public class LearnRecursion {

    static int count = 0;
    public static void tvDisplay() {
        count++;
        if (count < 5) {
            System.out.println("This is Recursion " + count);
            tvDisplay();
        }
    }

//    int ct=0;
//    public void Display(){
//        LearnRecursion ob = new LearnRecursion();
//        int cot=ob.ct++;
//        if (cot < 5){
//            System.out.println("This is another Recursion "+cot);
//            Display();
//        }
//    }

    public static void main(String[] args) {
        LearnRecursion.tvDisplay();

//        LearnRecursion obj = new LearnRecursion();
//        obj.Display();
    }
}
