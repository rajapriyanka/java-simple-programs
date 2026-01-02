class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            if(set.contains(num)){
                System.out.println(num);
return num;
                
            }
            set.add(num);
        }
return -1;
        
    }
}
