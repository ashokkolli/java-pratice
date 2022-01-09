package core.tiktok.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class _253_Meeting_Rooms_II {

    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
//(1, 10), (2, 7), (3, 19), (8, 12), (10, 20), (11, 30)
        //10
        //
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int count = 0;
        for (int[] itv : intervals) {
            if (heap.isEmpty()) {
                count++;
                heap.offer(itv[1]);
            } else {
                if (itv[0] >= heap.peek()) { // room available
                    heap.poll(); // remove the room reference
                } else {
                    count++;
                }

                heap.offer(itv[1]);
            }
        }

        return count;
    }


}