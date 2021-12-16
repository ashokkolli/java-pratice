package core.tiktok.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//https://www.programcreek.com/2014/05/leetcode-meeting-rooms-ii-java/
//https://leetcode.com/problems/meeting-rooms-ii/

public class _253_Meeting_Rooms_II {

    public static void main(String[] args) {
       int n =  minMeetingRooms(new int[][]{{0,30},{5,10},{15,20}});
        System.out.println(n);
    }
    public static int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparing((int[] itv) -> itv[0]));

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int count = 0;
        for (int[] itv : intervals) {
            if (heap.isEmpty()) {
                count++;
                heap.offer(itv[1]);
            } else {
                if (itv[0] >= heap.peek()) {
                    heap.poll();
                } else {
                    count++;
                }

                heap.offer(itv[1]);
            }
        }

        return count;
    }
}
