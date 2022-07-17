class Solution {

    public int longestPalindrome(String s) {
        if (s.length() == 0 || s == null) return 0;

        HashSet<Character> hset = new HashSet<>();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (hset.contains(s.charAt(i))) {
                hset.remove(s.charAt(i));
                count++;
            } else {
                hset.add(s.charAt(i));
            }
        }
        if (hset.isEmpty()) {
            return count * 2;
        }
        return count * 2 + 1;
    }
}
