package ProblemSolving;

import java.util.Scanner;

public class Find_Element_In_Array {
    public static void main(String[] args) {

        boolean isPresent = false;
        int index = 0;
        int arr[]={2,12,7,20,5,17,9};
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the Number to be search : ");
        int number=input.nextInt();

        for(int i=0; i<arr.length; i++){
            if (arr[i]==number){
                isPresent=true;
                index=i;
            }
        }
        if (isPresent==true){
            System.out.println("Element is Present at index : "+index);
        }else{
            System.out.println("Element is not Present");
        }
    }
}
