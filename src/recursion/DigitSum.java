package recursion;

public class DigitSum {
    public static void main(String[] args) {
        int no = 12345;
        int ans = digitSum(no);
        System.out.println(ans);
    }
    static int digitSum(int n){
        if (n == 0){
            return 0;
        }
        return (n % 10) + digitSum(n / 10);
    }

}
