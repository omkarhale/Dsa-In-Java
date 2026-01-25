package array;

public class RemoveElementInPlace {
    public static int removeElement(int arr[],int val){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != val){
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {22,33,4,5,22,70};
        int val = 22;
         int k = removeElement(arr,val);
        for (int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }

    }
}
