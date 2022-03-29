class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        ArrayList<List<Integer>> res = new ArrayList<>();
        
        Arrays.sort(nums);
        
        if(nums == null || nums.length == 0) {
            return res;
        }
        
        int n = nums.length;
        
        for(int i = 0; i < n; i++) {
            
            int tgt3 = target - nums[i];
            
            for(int j = i + 1; j < n; j++) {
                
                int tgt2 = tgt3 - nums[j];
                
                int s = j + 1;
                int e = n - 1;
                
                while(s < e) {
                     
                    int tgt1 = nums[s] + nums[e];
                    
                    if(tgt1 < tgt2) {
                        s++;
                    } else if(tgt1 > tgt2){
                        e--;
                    } else {
                        List<Integer> resEle = new ArrayList<>();
                        resEle.add(nums[i]);
                        resEle.add(nums[j]);
                        resEle.add(nums[s]);
                        resEle.add(nums[e]);
                        res.add(resEle);
                        
                        while(s < e && nums[s] == resEle.get(2)) {
                            s++;
                        }

                        while(s < e && nums[e] == resEle.get(3)) {
                            e--;
                        }
                    }
                }
                while(j + 1 < n && nums[j] == nums[j + 1]) {
                    j++;
                }
            }
            while(i + 1 < n && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return res;
    }
}