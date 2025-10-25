class Solution {
    public String lexSmallest(String s) {
        String smallest = s;
        int n = s.length();
        for (int k = 1; k <= n; k++) {
            // Reverse first k characters
            String revFirst = new StringBuilder(s.substring(0, k)).reverse().toString() + s.substring(k);
            if (revFirst.compareTo(smallest) < 0) {
                smallest = revFirst;
            }

            // Reverse last k characters
            String revLast = s.substring(0, n - k) + new StringBuilder(s.substring(n - k)).reverse().toString();
            if (revLast.compareTo(smallest) < 0) {
                smallest = revLast;
            }
        }

        return smallest;
    }
}
