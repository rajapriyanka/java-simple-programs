class Solution {
    public int minOperations(int[] nums) {
        // Check if all elements are already equal
        boolean allEqual = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[0]) {
                allEqual = false;
                break;
            }
        }
        if (allEqual) return 0;

        // Otherwise, we can always do it in 1 operation
        return 1;
    }
}
