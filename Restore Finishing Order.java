class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        // Store friends in a set for quick lookup
        Set<Integer> friendSet = new HashSet<>();
        for (int f : friends) {
            friendSet.add(f);
        }
        
        // Collect only friends in the order they appear
        List<Integer> result = new ArrayList<>();
        for (int id : order) {
            if (friendSet.contains(id)) {
                result.add(id);
            }
        }
        
        // Convert List to array
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}
