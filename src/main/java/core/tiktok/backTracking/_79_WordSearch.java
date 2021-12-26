package core.tiktok.backTracking;

public class _79_WordSearch {

    public boolean wordSearch(char[][] board, String word) {
        int nr = board.length;
        int nc = board[0].length;
        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {
                if (backTrack(board, r, c, word, 0))
                    return true;
            }
        }
        return false;
    }

    public boolean backTrack(char[][] grid, int r, int c, String word, int index){
        int nr = grid.length;
        int nc = grid[0].length;
        //step1 - check the bottom case;
        if(index >= word.length()) //means complete word is found
            return true;
        // Step-2 check the boundaries
        if (r < 0 || r == nr || c < 0 || c == nc ||  grid[r][c] != word.charAt(index))
            return false;
        //Step - 3 explore the neighbors in DFS
        boolean ret = false;
        // Mark the visited path before the next exploration
        grid[r][c] = '#';
        ret =   backTrack(grid, r, c -1, word, index + 1) ||
                backTrack(grid, r, c +1, word, index + 1) ||
                backTrack(grid, r -1 , c, word, index + 1) ||
                backTrack(grid, r + 1, c, word, index + 1) ;
        //Step - 4 Clean up and return the result
        grid[r][c] = word.charAt(index);
        return  ret;
    }
}
