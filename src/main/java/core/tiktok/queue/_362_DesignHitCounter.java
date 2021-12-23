package core.tiktok.queue;

import java.util.LinkedList;
import java.util.Queue;

public class _362_DesignHitCounter {
    private Queue<Integer> hits;

    /** Initialize your data structure here. */
    public _362_DesignHitCounter() {
        this.hits = new LinkedList<Integer>();
    }

    /** Record a hit.
     @param timestamp - The current timestamp (in seconds granularity). */
    public void hit(int timestamp) {
        this.hits.add(timestamp);
    }

    /** Return the number of hits in the past 5 minutes.
     @param timestamp - The current timestamp (in seconds granularity). */
    public int getHits(int timestamp) {

        while (!this.hits.isEmpty() && (timestamp - this.hits.peek()) >= 300)
            this.hits.remove();

        return this.hits.size();
    }
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */
