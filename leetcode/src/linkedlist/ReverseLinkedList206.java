package linkedlist;
/*
 * 206. Reverse Linked List  QuestionEditorial Solution  My Submissions
Total Accepted: 134005
Total Submissions: 324573
Difficulty: Easy
Reverse a singly linked list.
 */
//�����ܼ�  ֻ��Ҫ����ָ��
public class ReverseLinkedList206 {
public ListNode reverseList(ListNode head) {
	ListNode front=null;
	ListNode next=null;
	while(head!=null){
		next=head.next;
		head.next=front;
		front=head;
		head=next;
	}
        return front;
    }
}
