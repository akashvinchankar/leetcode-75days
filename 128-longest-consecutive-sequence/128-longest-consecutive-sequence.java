class Solution {

    public int longestConsecutive(int[] nums) {
        Set<Integer> hashset = new HashSet<Integer>();
        for (int num : nums) {
            hashset.add(num);
        }

        int longestStreak = 0;
        for (int num : nums) {
            if (!hashset.contains(num - 1)) {
                int currNum = num;
                int currStreak = 1;

                while (hashset.contains(currNum + 1)) {
                    currNum++;
                    currStreak++;
                }
                longestStreak = Math.max(longestStreak, currStreak);
            }
        }
        return longestStreak;
    }
}
