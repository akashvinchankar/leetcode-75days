class Solution {

    public List<String> generateParenthesis(int n) {
        String combi = "";
        List<String> validCombis = new ArrayList<>();
        int openCount = 0;
        int closeCount = 0;

        backtrack(validCombis, combi, openCount, closeCount, n);

        return validCombis;
    }

    public void backtrack(List<String> validCombis, String combi, int openCount, int closeCount, int n) {
        if (openCount == n && closeCount == n) {
            validCombis.add(combi);
            return;
        }

        if (openCount < n) {
            backtrack(validCombis, combi + "(", openCount + 1, closeCount, n);
        }

        if (closeCount < openCount) {
            backtrack(validCombis, combi + ")", openCount, closeCount + 1, n);
        }
    }
}
