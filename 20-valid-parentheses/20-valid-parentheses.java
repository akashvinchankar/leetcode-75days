class Solution {

    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stk.push(ch);
            } else if (stk.size() != 0) {
                if (ch == ')') {
                    if (stk.pop() != '(') return false;
                } else if (ch == '}') {
                    if (stk.pop() != '{') return false;
                } else if (ch == ']') {
                    if (stk.pop() != '[') return false;
                }
                // if stk size is zero
            } else {
                return false;
            }
        }
        // after all operations if still the is any element in the stk then the string is disbalanced
        if (stk.size() > 0) {
            return false;
        }
        return true;
    }
}
