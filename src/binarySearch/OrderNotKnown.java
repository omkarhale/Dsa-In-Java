package binarySearch;

public class OrderNotKnown {
    public static void main(String[] args) {
        int nums[]={60,50,40,30,20,10};
        int target=60;
        int result=orderNotKnown(nums,target);
        System.out.println(result);

    }
    public static int orderNotKnown(int nums[],int target){
        int start=0;
        int end=nums.length-1;
        boolean isAsc=nums[start]<nums[end];
        while (start<=end){
            int mid=start+(end-start)/2;
            if (nums[mid]==target){
                return mid;
            }
            if(isAsc){
                if (nums[mid]<target){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }else {
                if (nums[mid]<target){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }

}
