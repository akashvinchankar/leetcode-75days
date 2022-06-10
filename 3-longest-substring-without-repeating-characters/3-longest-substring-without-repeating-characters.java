class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        int left = 0;
        int right = 0;
        int maxLen = 0;

        while (right < s.length()) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            }
            map.put(s.charAt(right), right);
            maxLen = Math.max((right - left + 1), maxLen);
            right++;
        }
        return maxLen;
    }
}
