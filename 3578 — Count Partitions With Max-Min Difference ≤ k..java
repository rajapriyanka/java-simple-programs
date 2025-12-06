import java.util.*;

class Solution {
    static final long MOD = (long)1e9 + 7;
    public int countPartitions(int[] nums, int k) {
        int n = nums.length;
        long[] dp = new long[n + 1];
        long[] prefix = new long[n + 2];  
        dp[0] = 1;
        prefix[1] = 1;   
        Deque<Integer> minq = new ArrayDeque<>();
        Deque<Integer> maxq = new ArrayDeque<>();
        int left = 0;
        for (int i = 0; i < n; i++) {
            while (!maxq.isEmpty() && nums[maxq.peekLast()] < nums[i])
                maxq.pollLast();
            maxq.addLast(i);
            while (!minq.isEmpty() && nums[minq.peekLast()] > nums[i])
                minq.pollLast();
            minq.addLast(i);
            while (!minq.isEmpty() && !maxq.isEmpty() &&
                    nums[maxq.peekFirst()] - nums[minq.peekFirst()] > k) {

                if (maxq.peekFirst() == left) maxq.pollFirst();
                if (minq.peekFirst() == left) minq.pollFirst();
                left++;
            }
            long total = (prefix[i + 1] - prefix[left] + MOD) % MOD;
            dp[i + 1] = total;
            prefix[i + 2] = (prefix[i + 1] + dp[i + 1]) % MOD;
        }
        return (int)(dp[n] % MOD);
    }
}
