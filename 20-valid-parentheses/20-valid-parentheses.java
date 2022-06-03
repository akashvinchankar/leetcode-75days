class Solution {

    public boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (stack.size() != 0) {
                char popped = stack.pop();
                if (ch == ')') {
                    if (popped != '(') return false;
                } else if (ch == ']') {
                    if (popped != '[') return false;
                } else if (ch == '}') {
                    if (popped != '{') return false;
                }
            } else return false;
        }
        if (stack.size() > 0) return false;
        return true;
    }
}
