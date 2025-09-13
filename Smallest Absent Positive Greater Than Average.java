class Solution {
    public int smallestAbsent(int[] nums) {
        int n = nums.length;
        long sum = 0;

        // Calculate sum
        for (int num : nums) {
            sum += num;
        }

        // Calculate average
        double avg = (double) sum / n;

        // Put all numbers in a set for quick lookup
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Start checking from ceil(avg + 1) since it should be strictly greater
        int candidate = (int) Math.floor(avg) + 1;
        while (set.contains(candidate) || candidate <= 0) {
            candidate++;
        }

        return candidate;
    }
}
