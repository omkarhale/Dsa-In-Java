package binarySearch;

public class FloorCeil {
    public static void main(String[] args) {
        int nums[]={3, 4, 4, 7, 8, 10};
        int x=8;
        int start=0;
        int end=nums.length-1;
        int floor=-1;
        int ceil=-1;
        int[] getFloorAndCeil=floorCeil(nums,x,start,end,floor,ceil);
        System.out.println("Floor: " + getFloorAndCeil[0] + ", Ceil: " + getFloorAndCeil[1]);
    }
    public static int[] floorCeil(int nums[],int x,int start,int end,int floor,int ceil){
        while (start<=end){
            int mid=(start+end)/2;
            if (nums[mid]==x){
                return new int[]{x,x};
            } else if (nums[mid]<x) {
                floor=mid;
                start=mid+1;
            }else {
                ceil=nums[mid];
                end=mid-1;
            }
        }
        return new int[]{floor,ceil};
    }
}
