class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        combinationSumUtility(0, candidates, target, ans, ds);
        return ans;
    }

    void combinationSumUtility(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        //base condidtion
        // if ind reaches to arr length
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        //pick element from array
        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            combinationSumUtility(ind, arr, target - arr[ind], ans, ds);
            ds.remove(ds.size() - 1);
        }
        // do not pick element from array
        combinationSumUtility(ind + 1, arr, target, ans, ds);
    }
}
