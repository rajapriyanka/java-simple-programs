class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int previousOneIndex = -(k + 1);
        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            if (nums[currentIndex] == 1) {
                if (currentIndex - previousOneIndex - 1 < k) {
                    // Distance is less than k, so return false
                    return false;
                }
                // Update the position of the previous 1
                previousOneIndex = currentIndex;
            }
        }
      
        // All 1s are at least k distance apart
        return true;
    }
}
