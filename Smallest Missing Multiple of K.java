class Solution {
    public int missingMultiple(int[] nums, int k) {
        // Use a HashSet for O(1) lookup
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Start checking from the smallest multiple of k (i.e., k itself)
        int multiple = k;
        while (true) {
            if (!set.contains(multiple)) {
                return multiple; // Found the missing multiple
            }
            multiple += k; // Move to next multiple of k
        }
    }
}
