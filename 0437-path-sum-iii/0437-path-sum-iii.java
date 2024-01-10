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
    public void fun(TreeNode root,long t,long[] c){
        if(root==null) return;
        if(root.val==t) c[0]++;
        fun(root.left,t-root.val,c);
         fun(root.right,t-root.val,c);
        
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        long[] c={0};
        fun(root,targetSum,c);
        c[0]+=pathSum(root.left,targetSum) + pathSum(root.right,targetSum);
        return (int)c[0];
    }
}