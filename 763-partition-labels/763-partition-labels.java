class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] lst_idx = new int[26];
        for(int i = 0; i < s.length(); i++) {
            lst_idx[s.charAt(i) - 'a'] = i; 
        }
        
        List<Integer> result = new ArrayList<>();
        int start = 0;
        int end = 0;
        for(int i = 0; i < s.length(); i++) {
            end = Math.max(end, lst_idx[s.charAt(i) - 'a']);
            
            if(i == end) {
                result.add(i - start + 1);
                start = i + 1;
            }
        }
        return result;
    }
}