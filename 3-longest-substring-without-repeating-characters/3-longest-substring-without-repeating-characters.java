class Solution {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        
        int start = 0;
        int end = 0;
        int max = 0;
        
        HashSet<Character> hset = new HashSet<>();
        
        while(end < n) {
            if(!hset.contains(s.charAt(end))) {
                hset.add(s.charAt(end));
                end++;
                max = Math.max(hset.size(), max);
            } else {
                hset.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}
