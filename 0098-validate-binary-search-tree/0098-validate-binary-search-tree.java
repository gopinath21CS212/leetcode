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
    List<Integer> list=new ArrayList<>();
    public void fun(TreeNode root){
        if(root==null) return;
        fun(root.left);
         list.add(root.val);
        fun(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        fun(root);
       for(int i=1;i<list.size();i++){
           if(list.get(i-1)>=list.get(i))
           return false;
       }
       return true; 
    }
}