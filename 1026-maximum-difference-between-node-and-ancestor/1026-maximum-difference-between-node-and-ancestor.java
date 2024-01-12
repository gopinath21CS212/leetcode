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
    int res=0;
    public void helper(TreeNode root,int min,int max){
        if(root==null) return;
        min=Math.min(min,root.val);
        max=Math.max(root.val,max);
        if(root.left== null && root.right==null){
            int d=max-min;
            res=Math.max(res,d);
            return;
        }
       helper(root.left,min,max); 
       helper(root.right,min,max);
    }
    public int maxAncestorDiff(TreeNode root) {
    int max=-1;
    int min=Integer.MAX_VALUE;
      helper(root,min,max);
      return res;  
    }
}