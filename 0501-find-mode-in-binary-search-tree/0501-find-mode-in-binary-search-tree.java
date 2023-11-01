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
    public int[] findMode(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode ans=q.remove();
                map.put(ans.val,map.getOrDefault(ans.val,0)+1);
            
            if(ans.left!=null){
                q.add(ans.left);
            }
            if(ans.right!=null){
                q.add(ans.right);
            }
        }
        int max=0;
        for(int i:map.keySet()){
            max=Math.max(max,map.get(i));
        }
        List<Integer> answer= new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)==max){
              answer.add(key);
            }
        } 
        int result[]=new int[answer.size()];
        for(int i=0;i<answer.size();i++){
            result[i]=answer.get(i);
        }
        return result;  
    }
}