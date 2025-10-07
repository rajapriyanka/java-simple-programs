class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        TreeSet<Integer> sunnyDays = new TreeSet<>();
        Map<Integer, Integer> lastRainedLakes = new HashMap<>();
        for (int day = 0; day < n; day++) {
            int lake = rains[day];
            if (lake > 0) {
                if (lastRainedLakes.containsKey(lake)) {
                    Integer dryDay = sunnyDays.higher(lastRainedLakes.get(lake));
                    if (dryDay == null) {
                        return new int[0];
                    }
                    result[dryDay] = lake;
                    sunnyDays.remove(dryDay);
                }
                // Update the last rained day for this lake
                lastRainedLakes.put(lake, day);
            } else {
                // It's a sunny day, add to available sunny days
                sunnyDays.add(day);
                // Temporarily set to 1 (can be any positive number if not used)
                result[day] = 1;
            }
        }
      
        return result;
    }
}
