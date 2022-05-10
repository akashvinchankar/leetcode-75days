class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int n1 = -1;
        int n2 = -1;
        int c1 = 0;
        int c2 = 0;
        
        int len = nums.length;
        
        for(int i = 0; i < len; i++) {
            
            if(nums[i] == n1) {
                c1++;
            } else if(nums[i] == n2) {
                c2++;
            } else if(c1 == 0) {
                n1 = nums[i];
                c1 = 1;
            } else if(c2 == 0) {
                n2 = nums[i];
                c2 = 1;
            } else{ 
                c1--;
                c2--;
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        
        int count1 = 0;
        int count2 = 0;
        
        for(int i = 0; i < len; i++) {
            if(nums[i] == n1) 
                count1++;
            else if(nums[i] == n2) 
                count2++;  
         }
        
        if(count1 > len/3) ans.add(n1);
        if(count2 > len/3) ans.add(n2);
        
        return ans;
    }
}