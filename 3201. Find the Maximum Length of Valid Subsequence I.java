class Solution {
  public int maximumLength(int[] nums) {
    int[][] dp = new int[k][k];
    for (final int x : nums)
      for (int y = 0; y < 2; ++y)
        dp[x % 2][y] = dp[y][x % 2] + 1;

    return Arrays.stream(dp).flatMapToInt(Arrays::stream).max().getAsInt();
  }
}
