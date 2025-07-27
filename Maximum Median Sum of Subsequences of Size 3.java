class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        long sum=0;
        int index =n-2;
        for(int i =0;i<n/3;i++){
            sum +=nums[index];
            index-=2;
        }
        return sum;
    }
}
