package binarySearch;

public class RotatedBS {
    public static void main(String[] args) {
        int nums[] = {11, 12, 15,18, 2, 5, 6, 8};
        int n = nums.length;
        int target=15;
        int result = rotatedBs(nums, n,target);
        System.out.println("Index of minimum element: " + result);
        System.out.println("Minimum element: " + nums[result]);
    }

    public static int rotatedBs(int nums[], int n,int target) {
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            // Case: array already sorted
            if (nums[start] <= nums[end]) {
                return start;
            }

            int mid = start + (end - start) / 2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;
            if (nums[mid]==target){
                return mid;
            }
            // Check if mid is the minimum
            if (nums[mid] <= nums[next] && nums[mid] <= nums[prev]) {
                return mid;
            }


            // Decide which half to choose
            if (nums[start] <= nums[mid]) {
                // Left part is sorted, so min is in right half
                start = mid + 1;
            } else {
                // Right part is sorted, so min is in left half
                end = mid - 1;
            }
        }
        return -1;
    }
}
