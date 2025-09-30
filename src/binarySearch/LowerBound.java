package binarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int nums[]={3,5,8,15,19};
        int start=0;
        int end= nums.length-1;
        int x=9;
        int getLowerBound=lowerBound(nums,start,end,x);
        System.out.println(getLowerBound);
    }
    public static int lowerBound(int nums[],int start,int end,int x){
        while (start<=end){
            int mid=(start+end)/2;
            if (nums[mid]==x){
                return mid;
            } else if (nums[mid]<=x) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return start;
    }
}
