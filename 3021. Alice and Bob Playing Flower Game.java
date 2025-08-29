class Solution {
  public long flowerGame(int n, int m) {


    final int xEven = n / 2;
    final int yEven = m / 2;
    final int xOdd = (n + 1) / 2;
    final int yOdd = (m + 1) / 2;
    return (long) xEven * yOdd + (long) yEven * xOdd;
  }
}
