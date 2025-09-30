package binarySearch;

public class ReverseBS {
    public static void main(String[] args) {
        int nums[]={100,90,80,70,60,50,40,30,20,10};
        int target=90;
        int result=reverseBs(nums,target);
        System.out.println(result);
    }
    public static int reverseBs(int nums[],int target){
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start + end-start/2;
            if (nums[mid]==target){
                return mid;
            } else if (nums[mid]>target) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }
}
