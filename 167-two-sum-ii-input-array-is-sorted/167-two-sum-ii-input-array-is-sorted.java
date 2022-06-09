class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int l = 0;
        int r = numbers.length - 1;
        
        int[] indices = new int[2];
        
        while(l < r){
            int sum = numbers[l] + numbers[r];
            if(sum == target){
                indices[0] = l + 1;
                indices[1] = r + 1;
                break;
            } else if (sum < target) {
                l++;
            } else if(sum > target) {
                r--;
            }
        }
        return indices;
    }
}