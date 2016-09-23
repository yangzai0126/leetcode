package leetcode0509;
import java.util.*;
/*
 * Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.
Notes:
You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
 */
public class ImplementStackUsingQuenes {
//定义成员变量
	public Queue<Integer> q1 = new ArrayDeque<Integer>();
	public Queue<Integer> q2 = new ArrayDeque<Integer>();
	 // Push element x onto stack.
    public void push(int x) {
        if(q1.isEmpty()){
        	q1.add(x);
        	while(!q2.isEmpty()){
        		q1.add(q2.poll());
        	}
        }else{
        	q2.add(x);
        	while(!q1.isEmpty()){
        		q2.add(q1.poll());
        	}
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        if(this.empty()){
        	return;
        }else{
        	if(q1.isEmpty()){
        		q2.poll();
        	}else{
        		q1.poll();
        	}
        }
    }

    // Get the top element.
    public int top() {
    	if(this.empty()){
    		return (Integer) null;
    	}else
        if(q1.isEmpty()){
        	return q2.peek();
        }else{
        	return q1.peek();
        }
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q1.isEmpty()&&q2.isEmpty();
    }
}
