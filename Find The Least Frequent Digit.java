class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freq = new int[10]; // frequency of digits 0-9

        // count digit frequencies
        while (n > 0) {
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }

        int minFreq = Integer.MAX_VALUE;
        int result = -1;

        // find digit with minimum frequency
        for (int i = 0; i <= 9; i++) {
            if (freq[i] > 0 && freq[i] < minFreq) {
                minFreq = freq[i];
                result = i;
            }
        }

        return result;
    }
}
