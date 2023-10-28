/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
       public TreeNode balanceBST(ArrayList<Integer> list,int si,int end){
           if(si>end){
               return null;
           }
           int mid=(si+end)/2;
           TreeNode root=new TreeNode(list.get(mid));
          root.left= balanceBST(list,si,mid-1);
          root.right=balanceBST(list,mid+1,end);
          return root;
       }
    public TreeNode sortedListToBST(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer> ans=new ArrayList<>();
        while(temp!=null){
            ans.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(ans);
        System.out.println(ans);
    TreeNode root=balanceBST(ans,0,ans.size()-1);
        return root;
        
    }
}