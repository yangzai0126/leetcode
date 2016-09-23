package leetcode0429;
/*
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
 */

public class RemoveDuplicatesfrom {

	 public ListNode deleteDuplicates(ListNode head) {
		 
		 if(head==null||head.next==null){
			 return head;
		 } 
		 ListNode old=head;
		 ListNode old1=head;
		 int f=head.val;
		 head=head.next;
		 while(head!=null){
			 if(head.val==f){
				 old1.next=head.next;
			 }else{
			 f=head.val;
			 old1=head;
			 }
			 head=head.next;
		 }
	        return old;
	    }
}
 class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
