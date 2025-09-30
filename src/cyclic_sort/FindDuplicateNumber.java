package cyclic_sort;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int nums[] = {2, 5, 9, 8, 7, 1, 6, 2};
        System.out.println(findDuplicateNumber(nums));
    }

    static int findDuplicateNumber(int nums[]) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i]; // Duplicate found
                }
            } else {
                i++;
            }
        }
        return -1; // No duplicate found
    }

    static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}