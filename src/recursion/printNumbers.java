package recursion;

public class printNumbers {
    public static void main(String[] args) {
        int n=0;
        number(n);
    }
    public static void number(int n){
        if (n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);

        number(n+1);

    }
}
