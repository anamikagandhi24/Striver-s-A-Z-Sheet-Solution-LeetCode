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
    public ListNode mergeKLists(ListNode[] lists) {
        int k=lists.length;
        if(k==0)
            return null;
        return mergeK(0,k-1,lists);

    }
    public ListNode mergeK(int left,int right,ListNode[]lists){
        if(left==right){
            return lists[left];
        }
        int mid=left+(right-left)/2;
        ListNode leftList=mergeK(left,mid,lists);
        ListNode rightList=mergeK(mid+1,right,lists);
        return merge(leftList,rightList);
    }
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                curr.next=l1;
                curr=curr.next;
                l1=l1.next;
            }else{
                curr.next=l2;
                curr=curr.next;
                l2=l2.next;
            }
        }
        while(l1!=null){
            curr.next=l1;
            curr=curr.next;
            l1=l1.next;
        }
        while(l2!=null){
            curr.next=l2;
            curr=curr.next;
            l2=l2.next;
        }
        return dummy.next;
    }
}