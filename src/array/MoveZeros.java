package array;

import java.util.Arrays;
//Brute force Ap proach
public class MoveZeros {
    public static void main(String[] args) {
        int arr[] = {2,5,0,9,0,3,8};
        Arrays.sort(arr);
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
