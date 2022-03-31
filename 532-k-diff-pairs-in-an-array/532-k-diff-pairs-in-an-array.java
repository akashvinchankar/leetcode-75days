class Solution {
    public int findPairs(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        int ans = 0;
        
        for(int i : map.keySet()) {
            if(k > 0 && map.containsKey(i - k) || k == 0 && map.get(i) > 1) {
                ans++;
            }
        }
        return ans;
    }
}