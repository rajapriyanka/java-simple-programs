class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if (num % 2 == 0) {   // check if even
                result |= num;   // apply bitwise OR
            }
        }
        return result;
    }
}
