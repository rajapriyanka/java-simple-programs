class Solution {
    public List<String> partitionString(String s) {
        List<String> result = new ArrayList<>();
        Set<Character> seen = new HashSet<>();
        StringBuilder segment = new StringBuilder();
        for(char c : s.toCharArray()){
            if(seen.contains(c)){
                result.add(segment.toString());
                seen.clear();
                segment.setLength(0);
            }
            seen.add(c);
            segment.append(c);
        }
        if(segment.length() > 0){
            result.add(segment.toString());
        }
        return result;
        
    }
}©leetcode
