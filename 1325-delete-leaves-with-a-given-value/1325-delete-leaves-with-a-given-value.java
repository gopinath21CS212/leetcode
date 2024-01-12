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
    public boolean isTargetPresent(TreeNode root,int target){
        if(root==null) return false;
        if(root.left==null && root.right==null && root.val==target){
            return true;
        }
        return isTargetPresent(root.left,target) || isTargetPresent(root.right,target);
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root==null) return null;
        if(root.val==target && root.left==null && root.right==null){
            return null;
        }
        root.left = removeLeafNodes(root.left,target);
        root.right = removeLeafNodes(root.right,target);
        while(isTargetPresent(root,target)){
            root = removeLeafNodes(root,target);
        }
        return root;
    }
}