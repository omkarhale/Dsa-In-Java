package recursion;

import java.util.ArrayList;

public class ReturningArrayList {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,4,7,8,9};
        ArrayList<Integer> ans = returnArrayList(arr,4,0,new ArrayList<>());
        System.out.println(ans);

    }
    static ArrayList<Integer>returnArrayList(int arr[],int target,int index,ArrayList<Integer>list){
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return returnArrayList(arr,target,index+1,list);
    }
}
