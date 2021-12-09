package core.tiktok.linkedlist.singleLL;


//Definition for singly-linked list.
 class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

//https://leetcode.com/problems/reverse-linked-list/solution/
//https://www.youtube.com/watch?v=G0_I-ZF0S38


public class ReverseLinkedList {

    public static void main(String[] args) {

    }

    public static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;

    }

}
