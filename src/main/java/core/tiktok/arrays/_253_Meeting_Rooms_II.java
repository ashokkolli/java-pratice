package core.tiktok.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class _253_Meeting_Rooms_II {

    public int minMeetingRooms(int[][] intervals) {
        //       Arrays.sort(intervals, Comparator.comparingInt((int[] a) -> a[0]));
//       OR
        // (a,b) -> Integer.compare(a[0], a[0])) this is implementation of anonymous compare method of Comparator

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], a[0]));
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

    public int minMeetingRooms1(int[][] intervals) {
        //       Arrays.sort(intervals, Comparator.comparingInt((int[] a) -> a[0]));
//       OR
        // (a,b) -> Integer.compare(a[0], a[0])) this is implementation of anonymous compare method of Comparator
        // Compare the arrays [0,30],[5,10],[15,20] based on the first element

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // PQ is required to store the meeting end values from each interval;
        // Such that minimum values is stored first for which you can compare the next interval first value, so that
        // You will know if the room is available;
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int[] inv:
             intervals) {
            if (pq.isEmpty()){
                count++;
                pq.offer(inv[1]);
            }else{
                //if the there is a room available, please make it busy by removing
                if(inv[0] >= pq.peek())
                    pq.poll();
                else
                    count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {



    }


}
