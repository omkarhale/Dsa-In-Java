package array;

public class MoveZeros2 {
    public static void moveZeros(int arr[]){
        int insert = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                arr[insert] = arr[i];
                insert++;
            }
        }
        while (insert < arr.length){
            arr[insert++] = 0;
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,5,0,9,0,3,8};
        moveZeros(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
