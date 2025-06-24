class Solution {
  public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
    final int n = nums.length;
    List<Integer> ans = new ArrayList<>();
    for (int i = 0, j = 0; i < n; ++i) {
      while (j < n && (nums[j] != key || j < i - k))
        ++j;
      if (j == n)
        break;
      if (Math.abs(i - j) <= k)
        ans.add(i);
    }

    return ans;
  }
}


