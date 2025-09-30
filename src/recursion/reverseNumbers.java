package recursion;

public class reverseNumbers {
    public static void main(String[] args) {
        int n=5;
        reverseNumbers(n);
    }
    static void reverseNumbers(int n){
        if (n == 0){
            System.out.println(0);
            return;
        }
        System.out.println(n);

        reverseNumbers(n - 1);
    }
}
