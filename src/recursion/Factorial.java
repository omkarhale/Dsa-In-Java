package recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int ans = facto(n);
        System.out.println(ans);


    }
    static int facto(int n){
        if (n <= 1){
            return 1;
        }
        return n * facto(n - 1);

    }
}
