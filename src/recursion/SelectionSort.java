package recursion;

import java.util.Arrays;

public class SelectionSort {
//    public static void main(String[] args) {
//        int arr[] = {1,3,8,2,6,4};
//
//        selectionSort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void selectionSort(int arr[]){
//        for (int i = 0; i < arr.length; i++) {
//            int last = arr.length - i - 1;
//             int getLastIndex = getMaxIndex(arr,0 ,last);
//             swap(arr,getLastIndex,last);
//        }
//    }
//    public static int getMaxIndex(int arr[],int start,int end){
//        int max = start;
//        for (int i = start; i <=end; i++) {
//            if (arr[max] < arr[i]){
//                max = i;
//            }
//
//        }
//        return max;
//    }
//    public static void swap(int arr[],int first,int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
public static void main(String[] args) {
    int arr[] = {1,3,8,2,6,4};
    selection(arr, arr.length, 0,0);
    System.out.println(Arrays.toString(arr));
}
    static void selection (int arr[] ,int r,int c,int max){
        if (r == 0){
            return;
        }
        if (c < r){
            if (arr[c] > arr[max]){
                selection(arr,r,c+1,c);
            }else {
                selection(arr,r,c+1,max);
            }
        }else {
            int temp = arr[max];
           arr[max] = arr[r-1];
           arr[r-1] = temp;
            selection(arr,r-1,0,0);
        }
    }
}
