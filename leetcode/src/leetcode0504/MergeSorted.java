package leetcode0504;
/*
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Subscribe to see which companies asked this question
�����ڹ鲢����
 */
public class MergeSorted {

	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		 if(l1==null&&l2==null){
			 return null;
		 }
		 if(l1==null){
			 return l2;
		 }
		 if(l2==null){
			 return l1;
		 }
		 ListNode l3=new ListNode(0);//��ʼ��ͷ
		 ListNode head=l3;
		  if(l1.val<l2.val){
			  l3.val=l1.val;
			 l1=l1.next;
		 }else{
			  l3.val=l2.val;
			 l2=l2.next;
		 }
		  
		 while(l1!=null&&l2!=null){
		 if(l1.val<l2.val){
			 l3.next=new ListNode(l1.val);
			l3=l3.next; 
			l1=l1.next;
			 
		 }else{
			  l3.next=new ListNode(l2.val);
			 l2=l2.next;
			 l3=l3.next;
		 }
		 }
		 while(l1==null&&l2!=null){
			 l3.next=new ListNode(l2.val);
			 l3=l3.next; 
			 l2=l2.next;
		 }
		 while(l2==null&&l1!=null){
			 l3.next=new ListNode(l1.val);
			 l1=l1.next;
			 l3=l3.next;
		 }
		 return head;
	        
	    }
}
     class ListNode {
	     int val;
	      ListNode next;
	    ListNode(int x) { val = x; }
	  }
