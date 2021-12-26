package core.tiktok.backTracking;

public class _200_NumberOfIslands {
    public int numIslands(char[][] grid) {

        if (grid == null || grid.length == 0)
            return 0;
        int nr = grid.length;
        int nc = grid[0].length;
        int number_of_islands = 0;

        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {

                if (grid[r][c] == '1') {
                    ++number_of_islands;
                    dfs(grid, r, c);
                }
            }
        }
        return number_of_islands;
    }

    public void dfs(char[][] grid, int r, int c) {
        int nr = grid.length;
        int nc = grid[0].length;

        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] != '1') {
            return;
        }

        grid[r][c] = '2'; //assign visited element  a new number, easily identify
        // From given cell, we need to travers as [(1,0),(-1,0),(0,1),(0,-1)]
        dfs(grid, r + 1, c + 0);
        dfs(grid, r - 1, c + 0);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);


    }
}
