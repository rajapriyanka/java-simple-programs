class Solution {
    private static final long MOD = 1_000_000_007L;
    public int countPermutations(int[] complexity) {
        int n = complexity.length;
        for (int i = 1; i < n; ++i) {
            if (complexity[i] <= complexity[0]) return 0;
        }
        long ans = 1L;
        for (int i = 1; i <= n - 1; ++i) {
            ans = (ans * i) % MOD;
        }
        return (int) ans;
    }
}
