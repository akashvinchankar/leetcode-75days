class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int l = 0;
        int r = cardPoints.length - k;
        int total = 0;
        
        for(int i = r; i < cardPoints.length; i++) {
            total += cardPoints[i];
        }
        
        int result = total;
        
        while (r < cardPoints.length) {
            
            total += (cardPoints[l] - cardPoints[r]);
            
            result = Math.max(total, result);
            
            l++;
            r++;
        }
        return result;
    }
}