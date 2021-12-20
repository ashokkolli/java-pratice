package core.tiktok.trees.bst;

import java.util.LinkedList;
import java.util.List;

//Definition for a binary tree node.
class TreeNode_ {
    int val;
    TreeNode_ left;
    TreeNode_ right;
    TreeNode_() {}
    TreeNode_(int val) { this.val = val; }
    TreeNode_(int val, TreeNode_ left, TreeNode_ right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class _938_RangeSumOfBST {
    public int rangeSumBST(TreeNode_ root, int low, int high) {

        List<Integer> list = new LinkedList<>();
        inOrder(root, list);
        int sum = 0;
        if(list.contains(low) && list.contains(high))
            for(int n : list){
                //  if(low <= n && n <= high){
                //     sum = sum + n;
                // }
                if (n == high)
                {
                    sum += n;
                    break;
                }
                if (n >=low){
                    sum += n;
                }
            }
        return sum;

    }

    public void inOrder(TreeNode_ root, List<Integer> list){

        if(root != null){
            inOrder(root.left, list);
            list.add(root.val);
            inOrder(root.right, list);
        }
    }


}
