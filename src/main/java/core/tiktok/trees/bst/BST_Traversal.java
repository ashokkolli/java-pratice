package core.tiktok.trees.bst;
class Node {
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

public class BST_Traversal {
    // Root of Binary Tree
    Node root;

    BST_Traversal() { root = null; }

    /* Given a binary tree, print its nodes according to the
      "bottom-up" postorder traversal. */
    void postorder(Node node)
    {
        if (node == null)
            return;

        // first recur on left subtree
        postorder(node.left);

        // then recur on right subtree
        postorder(node.right);

        // now deal with the node
        System.out.print(node.key + " ");
    }

    /* Given a binary tree, print its nodes in inorder*/
    void inOrder(Node node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        inOrder(node.left);

        /* then print the data of node */
        System.out.print(node.key + " ");

        /* now recur on right child */
        inOrder(node.right);
    }

    /* Given a binary tree, print its nodes in preorder*/
    void preOrder(Node node)
    {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.key + " ");

        /* then recur on left subtree */
        preOrder(node.left);

        /* now recur on right subtree */
        preOrder(node.right);
    }

    // Wrappers over above recursive functions
    void postorder() { postorder(root); }
    void inOrder() { inOrder(root); }
    void preOrder() { preOrder(root); }

    // Driver method
    public static void main(String[] args)
    {
        BST_Traversal tree = new BST_Traversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println(
                "Preorder traversal of binary tree is ");
        tree.preOrder();

        System.out.println(
                "\nInorder traversal of binary tree is ");
        tree.inOrder();

        System.out.println(
                "\nPostorder traversal of binary tree is ");
        tree.postorder();
    }

}
