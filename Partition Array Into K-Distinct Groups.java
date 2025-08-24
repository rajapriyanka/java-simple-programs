class Solution {
    public boolean partitionArray(int[] nums, int k) {
        int n = nums.length;
        

        if (n % k != 0) return false;
        

        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        // Each number should not exceed group count
        int maxGroups = n / k;
        for (int count : freq.values()) {
            if (count > maxGroups) return false;
        }
        
        return true;
    }
}©leetcode
