class Solution {
  public int minimumOneBitOperations(int n) {
    if (n == 0)
      return 0;
    // x is the largest 2^k <= n.
    // x | x >> 1 -> x >> 1 needs 1 op.
    //     x >> 1 -> 0      needs x = 2^k - 1 ops.
    int x = 1;
    while (x * 2 <= n)
      x <<= 1;
    return minimumOneBitOperations(n ^ (x | x >> 1)) + 1 + x - 1;
  }
}
