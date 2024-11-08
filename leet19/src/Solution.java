import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stak = new Stack<>();
        TreeNode curr = root;
        List<Integer> result = new ArrayList<>();

        while(curr != null || !stak.isEmpty()){
            while(curr != null){
                stak.push(curr);
                curr = curr.left;
            }

            curr = stak.pop();
            result.add(curr.val);

            curr = curr.right;
        }

        return result;
    }
}