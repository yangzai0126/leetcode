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
//�����Ҳ�ܼ򵥶�������Ĳ������� ��ָ��ʵ�� �Ͽ���ʱ��Ҫ���˱���һЩ��Ϣ
public class OddEvenLinkedList328 {
public ListNode oddEvenList(ListNode head) {
        ListNode nhead=head;
        ListNode front=null;
        ListNode next=null;
        ListNode odd=null;
        int i=0;
        while(head!=null){
        	next=head.next;
        	i++;//λ�õ�����
        	if(i==2)
        		odd=head;//odd�����һ��ż����ָ��
        	if(next!=null){
        		head.next=next.next;
        		front=head;
        		head=next;
        	}else{
        		if(i%2==0){//���һ����ż��λ��
        			front.next=odd;
        		}else{//���һ��Ϊ����λ��
        			head.next=odd;
        		}
        		break;
        	}
        }
        return nhead;
    }
}
