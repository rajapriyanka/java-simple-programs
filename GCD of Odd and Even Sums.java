class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = n * n;          
        int sumEven = n * (n + 1);    
        return gcd(sumOdd, sumEven);
    }
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}

