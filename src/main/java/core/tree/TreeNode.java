package core.tree;

/**
 * Created by Ashok Kolli on 1/21/2021
 */

public class TreeNode {

    int data;
    private TreeNode leftChild;
    private TreeNode rightChild;


    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value == data)
            return;
        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            } else
                leftChild.insert(value);
        } else {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            } else
                rightChild.insert(value);
        }
    }


}
