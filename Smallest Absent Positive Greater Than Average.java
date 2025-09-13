class Solution {
    public int smallestAbsent(int[] nums) {
        int n = nums.length;
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }

        double avg = (double) sum / n;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int candidate = (int) Math.floor(avg) + 1;
        while (set.contains(candidate) || candidate <= 0) {
            candidate++;
        }

        return candidate;
    }
}
