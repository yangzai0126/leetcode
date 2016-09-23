package leetcode0505;
import java.util.*;
/*
 * Follow up for problem "Populating Next Right Pointers in Each Node".

What if the given tree could be any binary tree? Would your previous solution still work?

Note:

You may only use constant extra space.
For example,
Given the following binary tree,
         1
       /  \
      2    3
     / \    \
    4   5    7
After calling your function, the tree should look like:
         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \    \
    4-> 5 -> 7 -> NULL
    
    此题是用非递归 的队列实现的 类似于层次遍历  可能用递归会减少时间
 */
public class PopulationNextRightt {

public void connect(TreeLinkNode root) {
        Queue<TreeLinkNode> q =new ArrayDeque<TreeLinkNode>();
        if(root==null){
        	return;
        }else{
        	q.add(root);
        }
        while(!q.isEmpty()){
        	TreeLinkNode cur=q.poll();
        	TreeLinkNode left=cur.left;
        	TreeLinkNode right=cur.right;
        	TreeLinkNode pee=cur.next;
        	while(pee!=null&&pee.left==null&&pee.right==null){
        		pee=pee.next;
        	}
        	//第一种情况
        	if(left!=null&&right!=null){
        		left.next=right;      //给next赋值
        		if(pee!=null){
        			if(pee.left!=null){//下面要保证进入队列的不能为叶子结点
        				right.next=pee.left;
        			}else{
        				right.next=pee.right;
        			}
        		}
        		//开始进队
        		if(left.left!=null||left.right!=null){
        			q.add(left);
        		}
        		if(right.left!=null||right.right!=null){
        			q.add(right);
        		}
        	}
        	//第二种情况
        	if(left!=null&&right==null){
        		if(pee!=null){
        			if(pee.left!=null){//下面要保证进入队列的不能为叶子结点
        				left.next=pee.left;
        			}else{
        				left.next=pee.right;
        			}
        		}
        		//开始进队
        		if(left.left!=null||left.right!=null){
        			q.add(left);
        		}
        	}
        	//第三种情况
        	if(left==null&&right!=null){
        		if(pee!=null){
        			if(pee.left!=null){//下面要保证进入队列的不能为叶子结点
        				right.next=pee.left;
        			}else{
        				right.next=pee.right;
        			}
        		}
        		if(right.left!=null||right.right!=null){
        			q.add(right);
        		}
        		
        	}
        }
    }
}
