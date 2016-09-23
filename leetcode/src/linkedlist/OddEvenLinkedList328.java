package linkedlist;
/*
 * 328. Odd Even Linked List  QuestionEditorial Solution  My Submissions
Total Accepted: 40991
Total Submissions: 102090
Difficulty: Medium
Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

Example:
Given 1->2->3->4->5->NULL,
return 1->3->5->2->4->NULL.
 */
//这个题也很简单对于链表的操作就是 用指针实现 断开的时候不要忘了保存一些信息
public class OddEvenLinkedList328 {
public ListNode oddEvenList(ListNode head) {
        ListNode nhead=head;
        ListNode front=null;
        ListNode next=null;
        ListNode odd=null;
        int i=0;
        while(head!=null){
        	next=head.next;
        	i++;//位置的索引
        	if(i==2)
        		odd=head;//odd保存第一个偶数的指针
        	if(next!=null){
        		head.next=next.next;
        		front=head;
        		head=next;
        	}else{
        		if(i%2==0){//最后一个是偶数位置
        			front.next=odd;
        		}else{//最后一个为奇数位置
        			head.next=odd;
        		}
        		break;
        	}
        }
        return nhead;
    }
}
