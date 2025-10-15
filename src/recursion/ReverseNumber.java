package recursion;

public class ReverseNumber {
    static int sum = 0;

    public static void main(String[] args) {

        revNo(12345);
        System.out.println(sum);

    }

    static void revNo(int n) {
        if (n == 0) {
            return;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        revNo(n / 10);
    }
}
