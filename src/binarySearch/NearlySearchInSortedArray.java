package binarySearch;

public class NearlySearchInSortedArray {
    public static void main(String[] args) {
        int num[]={10,20,40,30,50};
        int k=30;
        int result=searchInSortedArray(num,k);
        System.out.println(result);
    }
    public static int searchInSortedArray(int num[],int k){
        int start=0;
        int end= num.length-1;
        while (start<=end){
            int mid=start + (end-start)/2;
            if (num[mid] == k){
                return mid;
            } else if (mid-1>start && num[mid-1] == k) {
                return mid-1;
            } else if (mid  + 1<end  && num[mid+1] == k) {
                return mid+1;
            } else if (num[mid]> k) {
                end=mid-2;
            }else {
                start=mid+2;
            }
        }return -1;
    }
}
