package leetcode0428;
/*
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.

Note:
Given m, n satisfy the following condition:
1 �� m �� n �� length of list.
//�������� ���ǻ�ͼ ��ϸ����ÿһ�����
 */
public class ReverseLinkedList2 {

	 public ListNode reverseBetween(ListNode head, int m, int n) {
		 int count=1;
		 ListNode pre=null;//mǰ��Ľڵ�
		 ListNode old=head;//��ʼ�Ľڵ�
		 while(count<m){
			 pre=head;
			 head=head.next;
			 count++;
		 }
		 if(m==1){
			 return reverseList(head,n-m);
		 } else{
			 pre.next=reverseList(head,n-m);
	         return old;
		 }
	    }
public ListNode reverseList(ListNode head, int n) {
	if(n==0){
		return head;
	}
	if(head==null||head.next==null){//��ʵ�����������Ժ��� ����Ϊ�������head==null,head.next==null ���� m==n ��n==0��Ҳ���ж�
		return head;
	}
	int count=0;
	ListNode nhead=head;//m�ڵ�
	ListNode first=null;
	ListNode mid=null;
	ListNode last=null;
	while(count<n&&head!=null&&head.next!=null){//��ʵhead!=null��head.next!=nullҲ����ɾ��
		last=head.next.next;
		head.next.next=head;
		mid=head.next;
		head.next=first;
		first=mid;
		head=last;
		count=count+2;
	}
	if(count==n){
		nhead.next=head.next;
		head.next=first;
		return head;
	}else if(count>n){
		nhead.next=head;
		return first;
	}
	return null;
    }
}
   
