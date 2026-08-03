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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode curr=head;
        int n=0;
        while(curr!=null){
            n++;
            curr=curr.next;
        }
        int base=n/k;
        int extra=n%k;
        curr=head;
        ListNode []ans=new ListNode[k];
        for(int i=0;i<k;i++){
            int size=base+(extra>0?1:0);
            ans[i]=curr;
            if(size==0){
                continue;
            }
            for(int j=1;j<size;j++){
                curr=curr.next;
            }
            ListNode next=curr.next;
            curr.next=null;
            curr=next;
            if(extra>0){
                extra--;
            }
        }
        return ans;
    }
}