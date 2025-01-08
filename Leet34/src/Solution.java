import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }

        TreeNode l = root.left;
        TreeNode r = root.right;

        mirror(r);

        return identical(l, r);
    }

    private void mirror(TreeNode node){
        if(node == null){
            return;
        }

        mirror(node.left);
        mirror(node.right);

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }

    private boolean identical(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }else if(p == null || q == null || q.val != p.val){
            return false;
        }

        return identical(p.left, q.left) && identical(p.right, q.right);
    }
}