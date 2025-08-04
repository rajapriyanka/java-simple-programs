class Solution {
    public int totalFruit(int[] tree) {

        HashMap<Integer, Integer> fruitCount = new HashMap<>();
        int start = 0; 
        int maxFruits = 0; 


        for (int end = 0; end < tree.length; end++) {
            // Add the current fruit to the fruitCount map or update its count
            fruitCount.put(tree[end], fruitCount.getOrDefault(tree[end], 0) + 1);

            // If the map contains more than 2 types of fruit, shrink the window from the start
            while (fruitCount.size() > 2) {
                fruitCount.put(tree[start], fruitCount.get(tree[start]) - 1);
                // If the count of a fruit at the start of the window becomes 0, remove it
                if (fruitCount.get(tree[start]) == 0) {
                    fruitCount.remove(tree[start]);
                }
                start++; // Move the start of the window forward
            }

            // Calculate the maximum number of fruits in the current window
            maxFruits = Math.max(maxFruits, end - start + 1);
        }
        // Return the size of the largest contiguous subarray with 2 types of fruits
        return maxFruits;
    }
}
