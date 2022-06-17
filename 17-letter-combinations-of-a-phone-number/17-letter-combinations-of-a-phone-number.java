class Solution {
    static String[] letters = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    List<String> results;
    public List<String> letterCombinations(String digits) {
        results = new ArrayList();
        
        //call this Backtracking method,
        //add all letter combination in list
        backtracking(digits, 0, new StringBuilder());
        
        return results;
    }
    
    private void backtracking(String digits, int index, StringBuilder sb){
        
        //base case
        //all dgits are covered
        if(index == digits.length()){
            
            //add this combination in the list
            if(sb.length() > 0)
                results.add(sb.toString());
            return;
        }
        
        //current digit
        int digit = digits.charAt(index) - '0';
        
        for(char letter : letters[digit].toCharArray()){
            //add this leeter
            sb.append(letter);
            
            
            backtracking(digits, index + 1, sb);
            
            //remove last added letter
            //to explore the different permuation of letters
            sb.deleteCharAt(sb.length() - 1);
        }
        
    }
    
    
}