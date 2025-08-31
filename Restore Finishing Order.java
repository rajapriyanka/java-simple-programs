
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> friendSet = new HashSet<>();
        for (int f : friends) {
            friendSet.add(f);
        }
        List<Integer> result = new ArrayList<>();
        for (int id : order) {
            if (friendSet.contains(id)) {
                result.add(id);
            }
        }
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}
