package core.imp.linkedlist;

public class DLL_Push_Append_Insert_Before_After {


    Node head; // head of list

    public void InsertAfter(Node prev_Node, int new_data) {

        /*1. check if the given prev_node is NULL */
        if (prev_Node == null) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }

        /* 2. allocate node
         * 3. put in the data */
        Node new_node = new Node(new_data);

        /* 4. Make next of new node as next of prev_node */
        if (new_node.next != null)
            new_node.next = prev_Node.next;

        /* 5. Make the next of prev_node as new_node */
        prev_Node.next = new_node;

        /* 6. Make prev_node as previous of new_node */
        new_node.prev = prev_Node;

        /* 7. Change previous of new_node's next node */
        if (new_node.next != null)
            new_node.next.prev = new_node;
    }

    // Add a node at the end of the list
    void append(int new_data) {
        /* 1. allocate node
         * 2. put in the data */
        Node new_node = new Node(new_data);

        Node last = head; /* used in step 5*/

        /* 3. This new node is going to be the last node, so
         * make next of it as NULL*/
        new_node.next = null;

        /* 4. If the Linked List is empty, then make the new
         * node as head */
        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }

        /* 5. Else traverse till the last node */
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = new_node;

        /* 7. Make last node as previous of new node */
        new_node.prev = last;
    }

    //Given a node as next_node, insert a new node before the given node */
    void insertBefore(Node head, Node next_node, int new_data) {
        /*1. check if the given next_node is NULL */
        if (next_node == null) {
            System.out.println("the given next node cannot be NULL");
            return;
        }

        /* 2. allocate new node */
        Node new_node = new Node(new_data);


        /* 4. Make prev of new node as prev of next_node */
        new_node.prev = next_node.prev;

        /* 5. Make the prev of next_node as new_node */
        next_node.prev = new_node;

        /* 6. Make next_node as next of new_node */
        new_node.next = next_node;

        /* 7. Change next of new_node's previous node */
        if (new_node.prev != null)
            new_node.prev.next = new_node;
    /* 8. If the prev of new_node is NULL, it will be
       the new head node */
        else
            head = new_node;

    }

    /* Doubly Linked list Node*/
    class Node {
        int data;
        Node prev;
        Node next;

        // Constructor to create a new node
        // next and prev is by default initialized as null
        Node(int d) {
            data = d;
            prev = null;
            next = null;
        }

        public void push(int new_data) {
            /* 1. allocate node
             * 2. put in the data */
            Node new_Node = new Node(new_data);

            /* 3. Make next of new node as head and previous as NULL */
            new_Node.next = head;
            new_Node.prev = null;

            /* 4. change prev of head node to new node */
            if (head != null)
                head.prev = new_Node;

            /* 5. move the head to point to the new node */
            head = new_Node;
        }
    }


}
