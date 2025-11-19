class Solution {

    public int findFinalValue(int[] nums, int original) {

        Set<Integer> numSet = new HashSet<>();
      

        for (int num : nums) {
            numSet.add(num);
        }
      

        while (numSet.contains(original)) {
            // Double the original value using left shift operation (equivalent to multiplying by 2)
            original <<= 1;
        }
      
        // Return the final value that is not present in the set
        return original;
    }
}
