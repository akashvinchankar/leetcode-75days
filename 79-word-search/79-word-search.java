class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (search(board, word, 0, i, j)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public boolean search(char[][] board, String word, int idx, int y, int x) {
        if (y < 0 || x < 0 || y >= board.length || x >= board[0].length) {
            return false;
        }
        char c = board[y][x];
        if (c != word.charAt(idx)) {
            return false;
        }
        if (idx == word.length() - 1) {
            return true;
        }

        board[y][x] = '.';
        
        if (search(board, word, idx + 1, y + 1, x)) {
            return true;
        }
        if (search(board, word, idx + 1, y - 1, x)) {
            return true;
        }
        if (search(board, word, idx + 1, y, x + 1)) {
            return true;
        }
        if (search(board, word, idx + 1, y, x - 1)) {
            return true;
        }
        
        board[y][x] = c;
        
        return false;
    }
}