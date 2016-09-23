package linkedlist;
import java.util.*;
/*
 * Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?
 */
//�������� �������е�����װ�� list ���ǿռ临�ӶȾͲ��� O(1) ��һ�ַ�ʽ�� �ҵ��е�  ��ת��벿������
public class PalindromeLinkedList234 {
public boolean isPalindrome(ListNode head) {
	    int length=0;//��¼������
	    ListNode midl=head;
	    ListNode front=null;//front Ҳ����û��
	   while(head!=null){
		   length++;
		   head=head.next;
	   }
	   //head==null
	   head=midl;
	   int mid=length/2;
	   for(int i=0;i<mid;i++){
		   front=midl;
		   midl=midl.next;
	   }
	   if(front!=null)
	   front.next=null;//ǰ�벿�ֵ�ĩβ��ֵΪ��
        ListNode reverse=reverseList(midl);
        while(head!=null){
        	if(head.val!=reverse.val)
        		return false;
        	head=head.next;
        	reverse=reverse.next;
        }
        return true;
    }
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
public static void main(String args[]){
	ListNode head=new ListNode(5);
	ListNode nhead=head;
	change(nhead);
	System.out.println(head.val);
}
public static void change(ListNode head){
	head.val=6;
}
}
