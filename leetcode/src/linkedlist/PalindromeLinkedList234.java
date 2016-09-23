package linkedlist;
import java.util.*;
/*
 * Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?
 */
//遍历链表 把练吧中的内容装入 list 但是空间复杂度就不是 O(1) 另一种方式是 找到中点  反转后半部分链表
public class PalindromeLinkedList234 {
public boolean isPalindrome(ListNode head) {
	    int length=0;//记录链表长度
	    ListNode midl=head;
	    ListNode front=null;//front 也可以没有
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
	   front.next=null;//前半部分的末尾赋值为空
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
