package binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90};
        int start=0;
        int end=arr.length-1;
        int element=600;
        boolean found=false;
        while (start<=end){
            int mid=(start+end)/2;
            if (arr[mid]==element){
                System.out.println("we found element at " +mid+" ");
                found=true;
                break;
            }
            if (arr[mid]<element){
                start=mid+1;
            }else {
                end=mid-1;
            }

        }
        if (!found){
            System.out.println("element not found");
        }
    }
}
