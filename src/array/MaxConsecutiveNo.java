package array;

public class MaxConsecutiveNo {

    public static int maxConectiveNo(int nums[]){
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                count++;
                maxCount = Math.max(maxCount,count);
            }else {
                count = 0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,0,0,1,1,1,1};
        System.out.println(maxConectiveNo(nums));
    }
}
