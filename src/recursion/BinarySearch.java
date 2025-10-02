package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,77,88,99};
        int target = 88;
        System.out.println(bs(arr,target,0, arr.length-1));
    }
    static int bs(int arr[],int target,int s,int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s)/2;
        if(arr[m] == target){
            return m;
        }
        if(target < arr[m]){
            return bs(arr,target,s,m-1);
        }
        return bs(arr,target,m+1,e);
    }
}
