class Solution {

    public int longestPalindrome(String s) {
        //         if (s.length() == 0 || s == null) return 0;

        //         HashSet<Character> hset = new HashSet<>();

        //         int count = 0;

        //         for (int i = 0; i < s.length(); i++) {
        //             if (hset.contains(s.charAt(i))) {
        //                 hset.remove(s.charAt(i));
        //                 count++;
        //             } else {
        //                 hset.add(s.charAt(i));
        //             }
        //         }
        //         if (hset.isEmpty()) {
        //             return count * 2;
        //         }
        //         return count * 2 + 1;

        int[] arr = new int[128];
        for (char c : s.toCharArray()) {
            arr[c]++;
        }

        int res = 0;
        for (int i : arr) {
            res = res + (i / 2 * 2);
            if (res % 2 == 0 && i % 2 == 1) {
                res++;
            }
        }
        return res;
    }
}
