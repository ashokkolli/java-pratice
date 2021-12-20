package core.tiktok.trees.bt;

import java.util.ArrayList;
import java.util.List;

class Node_ {
    int val;
    Node_ left;
    Node_ right;
    Node_() {}
    Node_(int val) { this.val = val; }
    Node_(int val, Node_ left, Node_ right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
};
public class _426_ConvertBinaryTreeToDoublyLinkedList {
    public Node_ treeToDoublyList(Node_ root) {

        Node_ front = null;
        Node_ rear = null;
        List<Node_> list = new ArrayList<>();
        if (root == null) return null;

        inOrder(root, list);

        for(Node_ node : list){

            if(rear!= null){
                rear.right = node;
                node.left = rear;


            }else
                front = node;

            rear = node;


        }

        //Close DLL
        rear.right = front;
        front.left = rear;

        return front;

    }

    public void inOrder(Node_ node, List<Node_> list){

        if(node!=null){

            inOrder(node.left, list);
            list.add(node);
            inOrder(node.right, list);

        }

    }


}
