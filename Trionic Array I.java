class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 3) return false;

        int i = 0;

        // First strictly increasing
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

        int p = i;

        // Strictly decreasing
        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }

        int q = i;

        // Final strictly increasing
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

        // Check if we have strictly increasing, then decreasing, then increasing
        return p > 0 && p < q && q < n - 1 && i == n - 1;
    }
}
©leetcode
