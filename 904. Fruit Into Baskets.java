class Solution {
    public int totalFruit(int[] tree) {

        HashMap<Integer, Integer> fruitCount = new HashMap<>();
        int start = 0; 
        int maxFruits = 0; 


        for (int end = 0; end < tree.length; end++) {

            fruitCount.put(tree[end], fruitCount.getOrDefault(tree[end], 0) + 1);

            while (fruitCount.size() > 2) {
                fruitCount.put(tree[start], fruitCount.get(tree[start]) - 1);

                if (fruitCount.get(tree[start]) == 0) {
                    fruitCount.remove(tree[start]);
                }
                start++;
            }

            // Calculate the maximum number of fruits in the current window
            maxFruits = Math.max(maxFruits, end - start + 1);
        }
        // Return the size of the largest contiguous subarray with 2 types of fruits
        return maxFruits;
    }
}
