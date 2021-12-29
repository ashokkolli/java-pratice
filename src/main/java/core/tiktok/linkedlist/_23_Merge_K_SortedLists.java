package core.tiktok.linkedlist;

class ListNodee {
    int val;
    ListNodee next;

    ListNodee() {
    }

    ListNodee(int val) {
        this.val = val;
    }

    ListNodee(int val, ListNodee next) {
        this.val = val;
        this.next = next;
    }
}


public class _23_Merge_K_SortedLists {

    public ListNodee mergeKSortedList(ListNodee[] listNodees){
        ListNodee head = new ListNodee(0);

        for(int i = 0; i < listNodees.length - 1 ; i++){
            head = mergeTwoLists(head, listNodees[i], listNodees[i+1]);
        }
      return  head.next;
    }

    public ListNodee mergeTwoLists(ListNodee head, ListNodee l1, ListNodee l2) {
        ListNodee rear = head;
        while (l1 != null && l2 != null) {
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
