package core.tiktok.backTracking;

import java.util.HashSet;
import java.util.Set;

public class _694_NumberOfDistinctIslands {

    // S - Starting Point
    // O - Out of bounds
    // L - Left
    // R - Right
    // D - Down
    // U - Up
    public int numDistinctIslands(int[][] grid) {

        if(grid == null || grid.length == 0)
            return 0;
        Set<String> set = new HashSet<>();
        int nr = grid.length;
        int nc = grid[0].length;

        for(int r = 0; r < nr ; r++){
            for(int c = 0; c < nc; c++){
                if(grid[r][c] == 1){
                    String path = computePath(grid, r, c, "X");
                    set.add(path);

                }
            }
        }
        return set.size();
    }

    private String computePath(int[][] grid, int r, int c, String direction){

        int nr = grid.length;
        int nc = grid[0].length;
        if(r < 0 || r >= nr || c < 0 || c >= nc || grid[r][c] != 1)
            return "O";
        grid[r][c] = 2;
        String left = computePath(grid, r, c, "L");
        String right = computePath(grid, r, c, "R");
        String down = computePath(grid, r, c, "D");
        String up = computePath(grid, r, c, "U");
        return direction + left + right + down + up;

    }


}
