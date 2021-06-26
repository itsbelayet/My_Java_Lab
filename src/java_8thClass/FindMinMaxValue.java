package java_8thClass;

public class FindMinMaxValue {

    static int[] ArrData(){
        return new int[]{85,50,900,25,105};
    }

    //This Method for Finding Minimum Value of the Array
    public static void MinValue(int[] ary){
        int min=ary[0];
        for (int i=0; i<ary.length; i++){
            if(min>ary[i]){
                min=ary[i];
            }
        }
        System.out.println("Minimum Value of the Array is : "+min);
    }

    //This Method for Finding Minimum Value of the Array
    public static void MaxValue(int[] ary){
        int mix=ary[0];
        for (int i=0; i<ary.length; i++){
            if(mix<ary[i]){
                mix=ary[i];
            }
        }
        System.out.println("Maximum Value of the Array is : "+mix);
    }

    public static void main(String[] args) {
        FindMinMaxValue.MinValue(ArrData());
        FindMinMaxValue.MaxValue(ArrData());
    }
}
