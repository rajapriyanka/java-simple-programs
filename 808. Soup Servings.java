class Solution {
    private double[][] memo = new double[200][200];

    public double soupServings(int n) {
      
        return n > 4800 ? 1.0 : dfs((n + 24) / 25, (n + 24) / 25);
    }

    private double dfs(int a, int b) {
      
        if (a <= 0 && b <= 0) {
            return 0.5;
        }
        if (a <= 0) {
            return 1.0;
        }
        if (b <= 0) {
            return 0;
        }
        if (memo[a][b] > 0) {
            return memo[a][b];
        }
        // Recursively compute the probability considering all 4 possible operation
        double probability = 0.25 * (
            dfs(a - 4, b) + 
            dfs(a - 3, b - 1) + 
            dfs(a - 2, b - 2) + 
            dfs(a - 1, b - 3)
        );
        // Store the computed probability in the memo cache
        memo[a][b] = probability;
        // Return the computed probability
        return probability;
    }
}
