package test_scripts;

public class TestQuestion2 {
    public static int countWays(int[] nums, int result) {
        return count(nums, 0, result);
    }

    public static int count(int[] nums, int index, int remaining) {
        if (remaining == 0) return 1;
        if (index >= nums.length || remaining < 0) return 0;

        int include = count(nums, index + 1, remaining - nums[index]);
        int skip = count(nums, index + 1, remaining);

        return include + skip;
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 60, 50, 70, 20};
        int result = 120;

        int ways = countWays(nums, result);

        System.out.println(ways + " Ways to sum to " + result);
    }
}
