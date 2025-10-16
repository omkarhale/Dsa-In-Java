package recursion;

public class TargetNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,8,9};
        System.out.println(find(arr,8,0));
    }
    static boolean find(int arr[],int target,int index){
            if (index == arr.length){
                return false;
            }
            return arr[index] == target || find(arr,target,index+1);
    }
}
