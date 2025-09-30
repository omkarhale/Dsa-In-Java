package slidingWindow;

public class MaxSum {
    public static void main(String[] args) {
        int num[]={2,5,6,1,8,9,7,5,99,2,3};
        int k=3;
        int n= num.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        int i=0;
        int j=0;
        while (j<n){
            sum=sum+num[j];
            if(j-i+1 < k){
                j++;
            } else if (j-i+1== k) {
                max=Math.max(max,sum);
                sum-=num[i];
                i++;
                j++;
            }
        }
        System.out.println(max);
    }
}
