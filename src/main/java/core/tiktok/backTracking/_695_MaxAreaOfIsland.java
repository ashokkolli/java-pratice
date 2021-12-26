package core.tiktok.backTracking;

public class _695_MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                maxArea = Math.max(maxArea, area(grid, r, c));
            }
        }
        return maxArea;
    }

    public int area(int[][] grid, int r, int c) {
        // Check the boundaries
        if (r < 0 || r == grid.length || c < 0 || c == grid[0].length || grid[r][c] != 1) {
            return 0;
        }
        //Mark the Visited
        grid[r][c] = 2;
        int local_area = 1;
        return (local_area +
                area(grid, r, c - 1) +
                area(grid, r, c + 1) +
                area(grid, r - 1, c) +
                area(grid, r + 1, c));

    }

}
