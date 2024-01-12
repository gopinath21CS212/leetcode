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
    public boolean isTargetPresent(TreeNode root){
        if(root==null) return false;
        if(root.left==null && root.right==null && root.val==0){
            return true;
        }
        return isTargetPresent(root.left) || isTargetPresent(root.right);
    }
    public TreeNode pruneTree(TreeNode root) {
        if(root==null) return null;
        if(root.val==0 && root.left==null && root.right==null){
            return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        while(isTargetPresent(root)){
            root = pruneTree(root);
        }
        return root;
    }

}