class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        if(nums == null || nums.length == 0) 
            return result;
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        // Find min and max from nums
        for(int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        
        // Put all existing numbers in a set
        Set<Integer> set = new HashSet<>();
        for(int n : nums) set.add(n);
        
        // Check which numbers from min to max are missing
        for(int i = min; i <= max; i++) {
            if(!set.contains(i)) {
                result.add(i);
            }
        }
        
        return result;
    }
}
