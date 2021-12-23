package core.tiktok.arrays;

import java.util.Arrays;
import java.util.LinkedList;

public class _56_MergeIntervals {

    public static void main(String[] args) {
        int[][] matrix = {{1,3},{2, 6},{8, 10}, {15, 18}};
        int[][] output = mergeIntervals(matrix);
        for(int i = 0; i < output.length; i++){
            for(int j =0 ; j < output[i].length; j++){
                System.out.println(output[i][j]);
            }
        }

    }

//https://leetcode.com/problems/merge-intervals/solution/

    public static int[][] mergeIntervals(int[][] intervals){
        //Sort it based on first field
        Arrays.sort(intervals, (int[] a, int[] b) -> Integer.compare(a[0], b[0]));// Please refer https://stackoverflow.com/questions/5393254/java-comparator-class-to-sort-arrays

        LinkedList<int[]> merged = new LinkedList<>();
        for(int[] interval : intervals){
            if(merged.isEmpty() || merged.getLast()[1]  < interval[0] ){
                merged.add(interval);
            }else{
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
