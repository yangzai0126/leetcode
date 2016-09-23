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
//������������ɾ���ڵ��ʱ�� һ��Ҫ���� һЩ�ֳ���Ϣ
public class RemoveLinkedListElements203 {
public ListNode removeElements(ListNode head, int val) {
       //�ʼ����ȥ��
	while(head!=null){
        	if(head.val==val)
        		head=head.next;
        	else
        		break;
        }
        if(head==null)
        	return head;
        ListNode rhead=head;//����ͷ���
        ListNode front=head;
        head=head.next;
        while(head!=null){
        	if(head.val==val){
        		//front ֵ����
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
