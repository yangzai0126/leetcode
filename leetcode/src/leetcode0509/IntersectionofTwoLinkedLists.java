package leetcode0509;
import java.util.*;
/*
 * Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
begin to intersect at node c1.
时间复杂度太差 估计有更好的解
 */
public class IntersectionofTwoLinkedLists {
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> lm = new HashSet<ListNode>();
        while(headA!=null){//改进的办法是不全部加入  慢慢一个一个的加入set并判断
        	lm.add(headA);
        	headA=headA.next;
        }
        while(headB!=null){
        	if(lm.contains(headB)){
        		return headB;
        	}else{
        		headB=headB.next;
        	}
        }
        return null;
    }
}
class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }