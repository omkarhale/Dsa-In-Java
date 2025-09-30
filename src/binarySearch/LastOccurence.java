package binarySearch;

public class LastOccurence {
    public static void main(String[] args) {
        int nums[]={5,7,8,8,9};
        int last=-1;
        int target=8;
        int lastOcc=lastOccurence(nums,target,last);
        System.out.println(lastOcc);

    }
    public static int lastOccurence(int nums[],int target,int last) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                last = mid;
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return last;
    }

    }
