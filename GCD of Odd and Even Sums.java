class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = n * n;           // sum of first n odd numbers
        int sumEven = n * (n + 1);    // sum of first n even numbers
        return gcd(sumOdd, sumEven);
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
©leetcode
