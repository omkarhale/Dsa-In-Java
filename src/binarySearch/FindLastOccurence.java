package binarySearch;

public class FindLastOccurence {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(lastOccurence(nums,target));
    }
    public static int lastOccurence(int nums[],int target){
        int start=0;
        int end=nums.length-1;
        int result=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (nums[mid]==target){
                result=mid;
                start=mid+1;
            } else if (nums[mid]<target) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return result;
    }
    }

