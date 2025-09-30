package binarySearch;

public class FirstOccurence {
    public static void main(String[] args) {
        int nums[]={5,7,8,8,9};
        int target=8;
        int firstOcc=firstOccurence(nums,target);
        System.out.println(firstOcc);

    }
    public static int firstOccurence(int nums[],int target){
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if (nums[mid]==target){
                start=mid;
                end=mid-1;
            } else if (nums[mid]<target) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return start;

    }
}
