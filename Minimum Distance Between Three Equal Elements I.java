class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], x -> new ArrayList<>()).add(i);
        }
        int minDist = Integer.MAX_VALUE;
        boolean found = false;
        for (List<Integer> list : map.values()) {
            if (list.size() >= 3) {
                found = true;
                for (int a = 0; a < list.size(); a++) {
                    for (int b = a + 1; b < list.size(); b++) {
                        for (int c = b + 1; c < list.size(); c++) {
                            int i = list.get(a);
                            int j = list.get(b);
                            int k = list.get(c);
                            int distance = Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i);
                            minDist = Math.min(minDist, distance);
                        }
                    }
                }
            }
        }

        return found ? minDist : -1;
    }
}
