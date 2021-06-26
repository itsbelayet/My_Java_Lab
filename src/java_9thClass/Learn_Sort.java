package java_9thClass;

import java.util.Arrays;

public class Learn_Sort {
    // Sort: Filtering
    // InsertionSort
    // Bubble sort
    // Heap sort
    // Quick sort
    // Merge sort
    // Selection sort
    // Bucket sort

    public static void main(String[] args) {
        int[] arr = {34, -10, 23, 3, 6, -29, 70, 0, 110, 90};
        System.out.println("\n****** Un-sorted Array **********");
        System.out.println(Arrays.toString(arr));

        System.out.println("\nInsertion Sort:");
        insertionSort(arr);

        System.out.println("\nBubble Sort:");
        bubbleSort(arr);

//        System.out.println("\n\nHeap Sort:");
//        heapSort(arr,arr.length);
//        System.out.println(Arrays.toString(arr));
//
//        System.out.println("\n\nQuick Sort:");
//        quickSort(arr,0,arr[arr.length-1]);
//        for (int ob:arr) {
//            System.out.print(ob+", ");
//        }
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i - 1;
            int point = arr[i];
            while (j >= 0 && arr[j] > point) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = point;
        }

//        for (int n = 0; n < arr.length; n++) {
//            System.out.print(arr[n] + ", ");
//        }
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int bs : arr) {
            System.out.print(bs + ", ");
        }
    }

    static void heapSort(int[] arr, int size) {
        for(int i=size/2-1; i>0; i--){
            heapify(arr,size, i);
        }
        for (int i=size-1; i>=0; i--){
            int temp=arr[0];
            arr[0]= arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
        }
    }
    static void heapify(int[] arr,int size,int i){
        int largest=i;
        int left=(2*i)+1;
        int right=(2*i)+2;

        if(left<size && arr[left]>arr[largest]){
            largest=left;
        }
        if(right<size && arr[right]>arr[largest]){
            largest=right;
        }
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr,size,largest);
        }
    }
//
//    static void quickSort(int arr[],int begin, int end){
//        if (begin<end){
//            int partitionIndex=partition(arr,begin,end);
//
//            quickSort(arr,begin,partitionIndex-1);
//            quickSort(arr,partitionIndex+1,end);
//        }
//    }
//    static int partition(int arr[],int begin,int end){
//        int pivot=arr[end];
//        int i=(begin-1);
//
//        for (int j=begin; j<end; j++){
//            if (arr[j]<=pivot){
//                i++;
//                int swapTemp=arr[i];
//                arr[i]=arr[j];
//                arr[j]=swapTemp;
//            }
//        }
//        int swapTemp=arr[i+1];
//        arr[i+1]=arr[end];
//        arr[end]=swapTemp;
//        return i+1;
//    }
}
