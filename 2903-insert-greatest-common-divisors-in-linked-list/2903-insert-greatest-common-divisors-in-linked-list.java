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
class Solution {
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
         return gcd(b,a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            ListNode curr=temp.next;
            ListNode next=new ListNode(gcd(temp.val,temp.next.val));
            temp.next=next;
            temp = temp.next;
            next.next=curr;
            temp=temp.next;
        }
        return head;
        
    }
}