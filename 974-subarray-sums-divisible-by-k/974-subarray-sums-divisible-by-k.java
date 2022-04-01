class Solution {
    public int subarraysDivByK(int[] nums, int K) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0, sum = 0;
        for(int a : nums) {
            sum = (sum + a) % K;
            if(sum < 0) sum += K;  
            count += map.getOrDefault(sum, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}