class Solution {
    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        int[] parent = new int[c + 1];
        int[] size = new int[c + 1];

        // DSU initialization
        for (int i = 1; i <= c; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        // Join connections
        for (int[] conn : connections) {
            union(conn[0], conn[1], parent, size);
        }

        // For each DSU root, maintain set of online stations
        Map<Integer, TreeSet<Integer>> map = new HashMap<>();
        boolean[] online = new boolean[c + 1];
        Arrays.fill(online, true);

        for (int i = 1; i <= c; i++) {
            int p = find(i, parent);
            map.putIfAbsent(p, new TreeSet<>());
            map.get(p).add(i);
        }

        List<Integer> result = new ArrayList<>();

        for (int[] q : queries) {
            int type = q[0], x = q[1];

            if (type == 1) {   // maintenance check
                if (online[x]) {
                    result.add(x);
                } else {
                    int p = find(x, parent);
                    TreeSet<Integer> set = map.get(p);
                    
                    if (set == null || set.isEmpty()) {
                        result.add(-1);
                    } else {
                        result.add(set.first());
                    }
                }

            } else {  // type 2 → go offline
                if (online[x]) {
                    online[x] = false;
                    int p = find(x, parent);
                    map.get(p).remove(x);
                }
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    private int find(int x, int[] parent) {
        if (parent[x] != x) parent[x] = find(parent[x], parent);
        return parent[x];
    }

    private void union(int a, int b, int[] parent, int[] size) {
        int pa = find(a, parent);
        int pb = find(b, parent);
        if (pa == pb) return;

        if (size[pa] < size[pb]) {
            parent[pa] = pb;
            size[pb] += size[pa];
        } else {
            parent[pb] = pa;
            size[pa] += size[pb];
        }
    }
}
