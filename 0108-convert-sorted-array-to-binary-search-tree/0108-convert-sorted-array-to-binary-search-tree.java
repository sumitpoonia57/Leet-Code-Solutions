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
     public static TreeNode height( TreeNode root, int nums[],int si,int end){
         if(si>end){
             return null;
         }
         int mid=(si+end)/2;
          root=new TreeNode(nums[mid]);
          root.left=height(root.left,nums,si,mid-1);
          root.right=height(root.right,nums,mid+1,end);
         return root;

     }
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root=null;
        TreeNode ans=height(root,nums,0,nums.length-1);
        return ans;
        
    }
}