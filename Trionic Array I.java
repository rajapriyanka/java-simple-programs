class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 3) return false;
        int i = 0;
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        int p = i;
        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }
        int q = i;
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        return p > 0 && p < q && q < n - 1 && i == n - 1;
    }

