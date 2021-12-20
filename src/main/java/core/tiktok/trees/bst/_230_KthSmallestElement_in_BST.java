package core.tiktok.trees.bst;
import java.util.ArrayList;
import java.util.List;

 //Definition for a binary tree node.
 class TreeNode {
     int val;
     TreeNode_ left;
     TreeNode_ right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode_ left, TreeNode_ right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

//https://leetcode.com/problems/kth-smallest-element-in-a-bst/

public class _230_KthSmallestElement_in_BST {

    public static List<Integer> inOrder(TreeNode_ node, List<Integer> list){
        if(node == null) return list;
        inOrder(node.left, list);
        list.add(node.val);
        inOrder(node.right, list);
        return list;
    }

    public static int kthSmallest(TreeNode_ node, int k){
        List<Integer> list = new ArrayList<>();
        list = inOrder(node, list);


        return list.get(k -1);
    }


}
