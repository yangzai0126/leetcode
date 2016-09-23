package linkedlist;
/*
 * 203. Remove Linked List Elements  QuestionEditorial Solution  My Submissions
Total Accepted: 75932
Total Submissions: 254234
Difficulty: Easy
Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
 */
//做链表的题就是删除节点的时候 一定要保存 一些现场信息
public class RemoveLinkedListElements203 {
public ListNode removeElements(ListNode head, int val) {
       //最开始的先去掉
	while(head!=null){
        	if(head.val==val)
        		head=head.next;
        	else
        		break;
        }
        if(head==null)
        	return head;
        ListNode rhead=head;//返回头结点
        ListNode front=head;
        head=head.next;
        while(head!=null){
        	if(head.val==val){
        		//front 值不变
        		front.next=head.next;
        		head=head.next;
        	}else{
        		front=head;
        		head=head.next;
        	}
        }
        return rhead;
    }
}
