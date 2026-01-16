import java.util.Arrays;

public class TwoString {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }

        }
        throw new IllegalArgumentException("No valid two-sum solution found");

    }

    public static void main(String[] args) {
        TwoString   twoString = new TwoString();
        int[] arr = {4,7,6,3};
        int[] result = twoString.twoSum(arr, 7);
        System.out.println(Arrays.toString(result));
    }
}
