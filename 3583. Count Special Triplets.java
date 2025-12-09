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
            int targetValue = currentNum * 2;
            long leftCount = leftCounts.getOrDefault(targetValue, 0);
            long rightCount = rightCounts.getOrDefault(targetValue, 0);
            long tripletCount = (leftCount * rightCount) % MOD;
            totalCount = (totalCount + tripletCount) % MOD;
          
            // Add current element to left counts (moving it from current position to left)
            leftCounts.merge(currentNum, 1, Integer::sum);
        }
      
        // Return the final count as an integer
        return (int) totalCount;
    }
}
