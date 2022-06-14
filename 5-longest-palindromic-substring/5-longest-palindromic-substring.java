class Solution {
    public String longestPalindrome(String s) {
        
        if(s.length() < 2) {
            return s;
        }
        
        int maxLen = 0;
        String ans = "";
        
        for(int i = 0; i < s.length(); i++) {
            
            // Odd Length
            int l = i;
            int r = i;
            
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if((r - l + 1) > maxLen) {
                    ans = s.substring(l, r + 1);
                    maxLen = r - l + 1;
                }
                l--;
                r++;
            }
            
            
            // Even Length
            l = i;
            r = i + 1;
            
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if((r - l + 1) > maxLen) {
                    ans = s.substring(l, r + 1);
                    maxLen = r - l + 1;
                }
                l--;
                r++;
            }
        }
        
        return ans;
    }
}