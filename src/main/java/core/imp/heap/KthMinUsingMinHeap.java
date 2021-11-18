//Operations on Min Heap:
//        1) getMini(): It returns the root element of Min Heap. Time Complexity of this operation is O(1).
//
//        2) extractMin(): Removes the minimum element from MinHeap. Time Complexity of this Operation is O(Logn) as this operation needs to maintain the heap property (by calling heapify()) after removing root.
//
//        3) decreaseKey(): Decreases value of key. The time complexity of this operation is O(Logn). If the decreases key value of a node is greater than the parent of the node, then we don’t need to do anything. Otherwise, we need to traverse up to fix the violated heap property.
//
//        4) insert(): Inserting a new key takes O(Logn) time. We add a new key at the end of the core.tree. IF new key is greater than its parent, then we don’t need to do anything. Otherwise, we need to traverse up to fix the violated heap property.
//
//        5) delete(): Deleting a key also takes O(Logn) time. We replace the key to be deleted with minum infinite by calling decreaseKey(). After decreaseKey(), the minus infinite value must reach root, so we call extractMin() to remove the key.


package core.imp.heap;

import java.util.PriorityQueue;

public class KthMinUsingMinHeap {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6};
        int k = 2;
        int smallest = kthSmallest(arr, k);
        System.out.println(smallest);
    }

    static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pr = new PriorityQueue<Integer>(k);
        for (int ele : arr) {
            pr.add(ele);

        }
        int kthSmall = -1;
        for (int i = 0; i < k; i++) {
            kthSmall = pr.poll();
        }
        return kthSmall;
    }
}
