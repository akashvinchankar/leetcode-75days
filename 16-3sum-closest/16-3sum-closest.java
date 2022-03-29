class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        int opt = Integer.MAX_VALUE;
        
        for(int i = 0; i < nums.length; i++) {
            
            int s = i + 1;
            int e = nums.length - 1;
            
            while(s < e) {
                int sum = nums[i] + nums[s] + nums[e];
                
                if( Math.abs(target - sum) < Math.abs(opt)) {
                    opt = target - sum;
                }
                
                if(target > sum) {
                    s++;
                } else {
                    e--;
                }
            }
        }
        return target - opt;
    }
}