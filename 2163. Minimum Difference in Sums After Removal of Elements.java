class Solution {
    public long minimumDifference(int[] nums) {
        int totalLength = nums.length; 
        int subsetSize = totalLength / 3; 
        long sum = 0; 
      
      
        long[] prefixSums = new long[totalLength + 1];
       
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 1; i <= subsetSize * 2; ++i) {
            int element = nums[i - 1];
            sum += element;
            maxHeap.offer(element);
          
            if (maxHeap.size() > subsetSize) {
                sum -= maxHeap.poll();
            }
           
            prefixSums[i] = sum;
        }
      
        sum = 0;
       
        long[] suffixSums = new long[totalLength + 1];
       
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = totalLength; i > subsetSize; --i) {
            int element = nums[i - 1];
            sum += element;
            minHeap.offer(element);
            // If the min heap size exceeds the subset size, remove the smallest element.
            if (minHeap.size() > subsetSize) {
                sum -= minHeap.poll();
            }
            // Store the running sum in suffixSums for the last 2/3 of the array.
            suffixSums[i] = sum;
        }
      
        // Initialize answer with a very large value.
        long answer = Long.MAX_VALUE;
        // Go through the middle 1/3 of the array to find the minimum sum difference.
        for (int i = subsetSize; i <= subsetSize * 2; ++i) {
            answer = Math.min(answer, prefixSums[i] - suffixSums[i + 1]);
        }
        // Return the minimum sum difference.
        return answer;
    }
}
