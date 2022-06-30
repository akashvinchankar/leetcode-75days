class Solution {

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        partitioning(0, s, result, new ArrayList<>());
        return result;
    }

    private void partitioning(int index, String s, List<List<String>> result, List<String> ds) {
        if (index == s.length()) {
            result.add(new ArrayList<>(ds));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                ds.add(s.substring(index, i + 1));
                partitioning(i + 1, s, result, ds);
                ds.remove(ds.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
