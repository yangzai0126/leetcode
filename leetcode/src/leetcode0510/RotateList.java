package leetcode0510;
import java.util.*;
public class RotateList {
public ListNode rotateRight(ListNode head, int k) {
        int length=0;//��¼������
        Map<Integer,ListNode> lm = new HashMap<Integer,ListNode>();
        ListNode oldhead = head;
        while(head!=null){
        	lm.put(length++,head );
        	head=head.next;
        }
        if(length==0){
        	return oldhead;
        }
        k=k%length;
        if(k!=0){
        	ListNode end =lm.get(length-1);//β
        	end.next=oldhead;
        	lm.get(length-k-1).next=null;
        	return lm.get(length-k);
        	
        }else{
        	return oldhead;
        }
    }
}

class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }