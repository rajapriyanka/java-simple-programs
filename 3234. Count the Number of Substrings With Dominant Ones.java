class Solution {
  public int numberOfSubstrings(String s) {
    int ans = 0;
    for (int zero = 0; zero + zero * zero <= s.length(); ++zero) {
      int lastInvalidPos = -1;
      int[] count = new int[2];
      for (int l = 0, r = 0; r < s.length(); ++r) {
        ++count[s.charAt(r) - '0'];
        for (; l < r; ++l)
          if (s.charAt(l) == '0' && count[0] > zero) {
            --count[0]; 
            lastInvalidPos = l;
          } else if (s.charAt(l) == '1' && count[1] - 1 >= zero * zero) {
            --count[1];
          } else {
            break;
          }
        if (count[0] == zero && count[1] >= zero * zero)
          ans += l - lastInvalidPos;
      }
    }
    return ans;
  }
}
