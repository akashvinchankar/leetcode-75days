class Solution {

    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;

        int maxL = 0;
        int maxR = 0;

        int totalWater = 0;

        while (l < r) {
            if (height[l] < height[r]) {
                maxL = Math.max(height[l], maxL);
                totalWater += maxL - height[l];
                l++;
            } else {
                maxR = Math.max(height[r], maxR);
                totalWater += maxR - height[r];
                r--;
            }
        }
        return totalWater;
    }
}
