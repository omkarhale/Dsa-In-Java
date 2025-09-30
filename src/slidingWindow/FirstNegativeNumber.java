package slidingWindow;

public class FirstNegativeNumber {
    public static void main(String[] args) {
        int num[] = {2, -5, 6, -1, 8, -9, -7, 5, -99, -2, 3};
        int n=num.length;
        int k=3;
        for (int i = 0; i < n-k; i++) {
            boolean found=false;
            for (int j = i; j < i + k; j++) {
                if (num[j]<0) {
                    found=true;
                    System.out.println(num[j]);
                    break;
                }
            }
            if (!found){
                System.out.println("0");
            }

        }

    }
    }

