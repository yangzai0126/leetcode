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
    
    �������÷ǵݹ� �Ķ���ʵ�ֵ� �����ڲ�α���  �����õݹ�����ʱ��
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
        	//��һ�����
        	if(left!=null&&right!=null){
        		left.next=right;      //��next��ֵ
        		if(pee!=null){
        			if(pee.left!=null){//����Ҫ��֤������еĲ���ΪҶ�ӽ��
        				right.next=pee.left;
        			}else{
        				right.next=pee.right;
        			}
        		}
        		//��ʼ����
        		if(left.left!=null||left.right!=null){
        			q.add(left);
        		}
        		if(right.left!=null||right.right!=null){
        			q.add(right);
        		}
        	}
        	//�ڶ������
        	if(left!=null&&right==null){
        		if(pee!=null){
        			if(pee.left!=null){//����Ҫ��֤������еĲ���ΪҶ�ӽ��
        				left.next=pee.left;
        			}else{
        				left.next=pee.right;
        			}
        		}
        		//��ʼ����
        		if(left.left!=null||left.right!=null){
        			q.add(left);
        		}
        	}
        	//���������
        	if(left==null&&right!=null){
        		if(pee!=null){
        			if(pee.left!=null){//����Ҫ��֤������еĲ���ΪҶ�ӽ��
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
