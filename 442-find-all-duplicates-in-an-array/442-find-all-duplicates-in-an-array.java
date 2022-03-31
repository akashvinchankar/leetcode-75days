class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}