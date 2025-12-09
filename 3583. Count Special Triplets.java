class Solution {
    public int specialTriplets(int[] nums) {
        Map<Integer, Integer> leftCounts = new HashMap<>();
        Map<Integer, Integer> rightCounts = new HashMap<>();
        for (int num : nums) {
            rightCounts.merge(num, 1, Integer::sum);
        }
        long totalCount = 0;
        final int MOD = (int) 1e9 + 7;
        for (int currentNum : nums) {
            rightCounts.merge(currentNum, -1, Integer::sum);
          
            // Calculate the target value that should appear on both sides
            // For this to be a special triplet, we need elements equal to 2 * currentNum
            int targetValue = currentNum * 2;
          
            // Count triplets where left and right elements both equal targetValue
            // and current element is in the middle
            long leftCount = leftCounts.getOrDefault(targetValue, 0);
            long rightCount = rightCounts.getOrDefault(targetValue, 0);
            long tripletCount = (leftCount * rightCount) % MOD;
          
            // Add the count of triplets with current element as middle
            totalCount = (totalCount + tripletCount) % MOD;
          
            // Add current element to left counts (moving it from current position to left)
            leftCounts.merge(currentNum, 1, Integer::sum);
        }
      
        // Return the final count as an integer
        return (int) totalCount;
    }
}
