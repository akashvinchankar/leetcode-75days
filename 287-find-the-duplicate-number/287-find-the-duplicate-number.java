class Solution {
    public int findDuplicate(int[] nums) {
        
        int[] count = new int[nums.length + 1];
        
        for(int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
            
           // System.out.println(Arrays.toString(count));
            
            if(count[nums[i]] > 1) {
                return nums[i];
            }
        }
        return -1;
    }
}