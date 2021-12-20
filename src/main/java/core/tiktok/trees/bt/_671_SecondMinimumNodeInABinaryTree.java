package core.tiktok.trees.bt;

//https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/



import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class _671_SecondMinimumNodeInABinaryTree {

    public void dfs(TreeNode root, Set<Integer> uniques){
        if(root!= null){
            uniques.add(root.val);
            dfs(root.left, uniques);
            dfs(root.right, uniques);

        }

    }

    public int findSecondMinimumValue(TreeNode root) {

        Set<Integer> uniques = new HashSet<>();
        dfs(root, uniques);
        if(uniques.size() >=2){
            uniques.remove(Collections.min(uniques));
            return Collections.min(uniques);
        }
        return -1;

    }


}
