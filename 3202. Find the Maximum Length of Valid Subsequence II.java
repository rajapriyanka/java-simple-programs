class Solution {
    public int maximumLength(int[] nums, int k) {

        int[][] subarrayLengths = new int[k][k];  
        int maxLength = 0; 

       
        for (int num : nums) {
            int modValue = num % k;  
          
            
            for (int j = 0; j < k; ++j) {
                int requiredMod = (j - modValue + k) % k; 

               
                subarrayLengths[modValue][requiredMod] = subarrayLengths[requiredMod][modValue] + 1;

              
                maxLength = Math.max(maxLength, subarrayLengths[modValue][requiredMod]);
            }
        }
        return maxLength;  // Return the maximum subarray length satisfying the condition
    }
}
