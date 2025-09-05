class Solution {
  public int makeTheIntegerZero(int num1, int num2) {
   



    // 2^0 (x times), which also results in 0.

    for (long ops = 0; ops <= 60; ++ops) {
      long target = num1 - ops * num2;
      if (Long.bitCount(target) <= ops && ops <= target)
        return (int) ops;
    }

    return -1;
  }
}
