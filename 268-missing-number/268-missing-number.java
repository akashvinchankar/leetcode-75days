class Solution {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        int s = 0;
        int e = nums.length;
        
        while (s < e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] > mid) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }
}
