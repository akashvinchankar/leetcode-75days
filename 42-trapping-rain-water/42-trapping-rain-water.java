class Solution {
    public int trap(int[] height) {
        
        int l = 0;
        int r = height.length - 1;
        
        int maxL = 0;
        int maxR = 0;
        
        int totalWater = 0;
        
        while(l < r) {
            maxL = Math.max(height[l], maxL);
            maxR = Math.max(height[r], maxR);
            
            if(maxL < maxR) {
                totalWater += maxL - height[l];
                l++;
            } else {
                totalWater += maxR - height[r];
                r--;
            }
        }
        return totalWater;
    }
}