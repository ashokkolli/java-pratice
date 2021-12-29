package core.tiktok.linkedlist;
class ListNode {
    int val;
   ListNodee next;
    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNodee next) {
        this.val = val;
        this.next = next;
    }
}

public class _21_MergeTwoSortedLinkedLists {
    public ListNodee mergeTwoLists(ListNodee l1, ListNodee l2) {
        ListNodee head = new ListNodee(0);
        ListNodee rear = head;
        while(l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                rear.next = l1;
                l1 = l1.next;
            } else {
                rear.next = l2;
                l2 = l2.next;
            }
            rear = rear.next;
        }

        if (l1 != null) {
            rear.next = l1;
        } else if (l2 != null) {
            rear.next = l2;
        }

        return head.next;
    }

}
