class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        ArrayList<Integer> res = new ArrayList<>();
        
        int[] count = new int[nums.length + 1];
        
        for(int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
            
            if(count[nums[i]] > 1) {
                res.add(nums[i]);
            }
        }
        return res; 
    }
}
