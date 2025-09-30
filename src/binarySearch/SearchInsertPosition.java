package binarySearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int nums[]={1,3,5,6};
        int start=0;
        int end= nums.length-1;
        int x=5;
        int insertPostion=search(nums,start,end,x);
        System.out.println(insertPostion);
    }
    public static int search(int nums[],int start,int end,int x){
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

