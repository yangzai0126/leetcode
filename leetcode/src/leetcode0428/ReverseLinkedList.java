package leetcode0428;

public class ReverseLinkedList {

public ListNode reverseList(ListNode head) {
	if(head==null||head.next==null){
		return head;
	}
	ListNode first=null;
	ListNode mid=null;
	ListNode last=null;
	while(head!=null&&head.next!=null){
		last=head.next.next;
		head.next.next=head;
		mid=head.next;
		head.next=first;
		first=mid;
		head=last;
	}
	if(head==null){
		return first;
	}else{
		head.next=first;
        return head;
	}
    }
}
   class ListNode {
 	      int val;
	     ListNode next;
	      ListNode(int x) { val = x; }
	  }