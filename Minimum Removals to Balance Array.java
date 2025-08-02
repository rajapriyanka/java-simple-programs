
class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int minRemovals = n;

        for (int i = 0; i < n; i++) {
            long maxAllowed = (long) nums[i] * k;

            int low = i, high = n - 1, right = i;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] <= maxAllowed) {
                    right = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            int subarraySize = right - i + 1;
            int removals = n - subarraySize;
            minRemovals = Math.min(minRemovals, removals);
        }

        return minRemovals;
    }
}
