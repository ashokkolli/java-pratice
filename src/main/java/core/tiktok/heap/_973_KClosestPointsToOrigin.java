package core.tiktok.heap;

import java.util.Arrays;

public class _973_KClosestPointsToOrigin {
    //We can reframe this problem as finding k points with the smallest squared Euclidean distance from the origin
    // When seeking the smallest elements in a list, an intuitive first step is to sort the list,
    // as this will bring the smallest elements to the front.

    //Therefore, in this problem, we can sort the entire points array using a custom comparator
    public int[][] kClosest(int[][] points, int k) {

        Arrays.sort(points, (a, b) -> Integer.compare(squaredDistance(a), squaredDistance(b)));

       return Arrays.copyOf(points, k);

    }

    private int squaredDistance(int[] point){
        // Calculate and return the squared Euclidean Distance
        return  point[0]*point[0] + point[1]*point[1];
    }
}
