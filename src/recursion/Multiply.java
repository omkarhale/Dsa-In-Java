package recursion;

public class Multiply {
    public static void main(String[] args) {
        int no = 12345;
        int ans = digitSum(no);
        System.out.println(ans);
    }
    static int digitSum(int n){
        if (n%10 == n){
            return n;
        }
        return (n % 10) * digitSum(n / 10);
    }
}
