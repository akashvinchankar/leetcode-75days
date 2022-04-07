class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int l = find(nums, 0, nums.length - 1, target);
        
        if(nums.length == 0 || nums[l] != target) 
            return new int[]{-1, -1};
        
        int r = find(nums, 0, nums.length-1, target + 1);
        
        if(nums[r] != target)
            r--;
        
        return new int[]{l,r};
    }
    
    public int find(int[] nums, int l, int r, int target){
        
        while(l < r){
            int mid = l + (r - l) / 2;
            if(nums[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}