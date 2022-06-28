class Solution {

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int maxSeq = 0;

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int curNum = num;
                int curStreak = 1;
                while (set.contains(curNum + 1)) {
                    curNum++;
                    curStreak++;
                }
                maxSeq = Math.max(maxSeq, curStreak);
            }
        }
        return maxSeq;
    }
}
