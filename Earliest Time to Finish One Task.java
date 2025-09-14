class Solution {
    public int earliestTime(int[][] tasks) {
        int ans = Integer.MAX_VALUE;
        for (int[] task : tasks) {
            int start = task[0];
            int duration = task[1];
            int finish = start + duration;
            ans = Math.min(ans, finish);
        }
        
        return ans;
    }
}
