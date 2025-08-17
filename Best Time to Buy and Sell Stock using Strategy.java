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
                delta += ((long) 1 - strategy[i]) * prices[i];  // turn to sell
            }
        }
        maxProfit = Math.max(maxProfit, originalProfit + delta);

        // Step 3: Slide window
        for (int start = 1; start + k <= n; start++) {
            // Remove old window's contribution at index (start-1)
            int outIdx = start - 1;
            if (0 < k / 2) { // outgoing was in first half
                delta -= -(long) strategy[outIdx] * prices[outIdx];
            } else { // outgoing was in second half
                delta -= ((long) 1 - strategy[outIdx]) * prices[outIdx];
            }

            // Shift all indices → instead of re-checking all, just recompute new entering element
            int inIdx = start + k - 1;
            if (k - 1 < k / 2) { // entering goes to first half
                delta += -(long) strategy[inIdx] * prices[inIdx];
            } else { // entering goes to second half
                delta += ((long) 1 - strategy[inIdx]) * prices[inIdx];
            }

            // Recompute correction for the boundary shift:
            // The element at index (start-1 + k/2) changes role:
            int midIdx = start - 1 + k / 2;
            // Previously it was in second half, now in first half
            delta -= ((long) 1 - strategy[midIdx]) * prices[midIdx];
            delta += -(long) strategy[midIdx] * prices[midIdx];

            // Update max
            maxProfit = Math.max(maxProfit, originalProfit + delta);
        }

        return maxProfit;
    }
}
