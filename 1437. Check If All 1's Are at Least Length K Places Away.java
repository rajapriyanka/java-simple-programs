class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int previousOneIndex = -(k + 1);
      
        // Iterate through the array to find all 1s
        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            // Check if current element is 1
            if (nums[currentIndex] == 1) {
                // Calculate distance between current 1 and previous 1
                // Distance = currentIndex - previousOneIndex - 1 (excluding both endpoints)
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
