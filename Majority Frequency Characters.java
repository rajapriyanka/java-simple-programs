class Solution {
    public String majorityFrequencyGroup(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        Map<Integer, List<Character>> groups = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            int count = entry.getValue();
            groups.computeIfAbsent(count, k -> new ArrayList<>()).add(entry.getKey());
        }
        int bestSize = 0, bestFreq = 0;
        List<Character> bestGroup = new ArrayList<>();

        for (Map.Entry<Integer, List<Character>> entry : groups.entrySet()) {
            int count = entry.getKey();
            List<Character> chars = entry.getValue();

            if (chars.size() > bestSize || 
               (chars.size() == bestSize && count > bestFreq)) {
                bestSize = chars.size();
                bestFreq = count;
                bestGroup = chars;
            }
        }

        // Step 4: Return string with characters
        StringBuilder result = new StringBuilder();
        for (char c : bestGroup) {
            result.append(c);
        }
        return result.toString();
    }
}
