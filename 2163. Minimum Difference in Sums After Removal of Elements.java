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
           
            if (minHeap.size() > subsetSize) {
                sum -= minHeap.poll();
            }
           
            suffixSums[i] = sum;
        }
        long answer = Long.MAX_VALUE;
       
        for (int i = subsetSize; i <= subsetSize * 2; ++i) {
            answer = Math.min(answer, prefixSums[i] - suffixSums[i + 1]);
        }
        return answer;
    }
}
