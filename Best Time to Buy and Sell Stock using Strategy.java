class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;

        long originalProfit = 0;
        for (int i = 0; i < n; i++) {
            originalProfit += (long) strategy[i] * prices[i];
        }

        long maxProfit = originalProfit;

        long delta = 0;
        for (int i = 0; i < k; i++) {
            if (i < k / 2) {
                delta += -(long) strategy[i] * prices[i]; 
            } else {
                delta += ((long) 1 - strategy[i]) * prices[i];  
            }
        }
        maxProfit = Math.max(maxProfit, originalProfit + delta);
        for (int start = 1; start + k <= n; start++) {
            int outIdx = start - 1;
            if (0 < k / 2) { 
                delta -= -(long) strategy[outIdx] * prices[outIdx];
            } else { 
                delta -= ((long) 1 - strategy[outIdx]) * prices[outIdx];
            }
            int inIdx = start + k - 1;
            if (k - 1 < k / 2) { 
                delta += -(long) strategy[inIdx] * prices[inIdx];
            } else { 
                delta += ((long) 1 - strategy[inIdx]) * prices[inIdx];
            }
            int midIdx = start - 1 + k / 2;
            delta -= ((long) 1 - strategy[midIdx]) * prices[midIdx];
            delta += -(long) strategy[midIdx] * prices[midIdx];
            maxProfit = Math.max(maxProfit, originalProfit + delta);
        }

        return maxProfit;
    }
}
