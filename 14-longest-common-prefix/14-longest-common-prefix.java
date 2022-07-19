class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        String first = strs[0];
        int len = first.length();
        for (String str : strs) {
            int i = 0;
            for (; i < len && i < str.length(); i++) {
                if (str.charAt(i) != first.charAt(i)) {
                    break;
                }
            }
            len = i;
        }
        return first.substring(0, len);
    }
}
