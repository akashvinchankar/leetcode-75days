class Solution {

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] output = new int[n + 1][n + 1];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                output[i][j] = Math.min(output[i + 1][j], output[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }
        return output[0][0];
    }
}
