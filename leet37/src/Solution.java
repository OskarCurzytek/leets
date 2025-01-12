import javax.swing.tree.TreeNode;
import java.util.*;

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }

        TreeNode current = root;
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        int direction = 0;

        q.add(current);


        while(!q.isEmpty()){

            List<Integer> subResult = new ArrayList<>();
            int size = q.size();

            for(int i = 0; i < size; i++){

                current = q.poll();
                subResult.add(current.val);

                if(current.left != null){
                    q.add(current.left);
                }

                if(current.right != null){
                    q.add(current.right);
                }
            }
            if(direction == 0){
                result.add(subResult);
                direction++;
            }else{
                Collections.reverse(subResult);
                result.add(subResult);
                direction--;
            }
        }

        return result;
    }
}