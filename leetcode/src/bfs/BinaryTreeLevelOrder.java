package bfs;
/*102. Binary Tree Level Order Traversal  QuestionEditorial Solution  My Submissions
Difficulty: Easy
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
*/
import java.util.*;

public class BinaryTreeLevelOrder {
public List<List<Integer>> levelOrder(TreeNode root) {
	    LinkedList<TreeNode> l1 =new LinkedList<TreeNode>();//���д洢��ǰ��
	    List<List<Integer>> ll =new ArrayList<List<Integer>>();//�����б�
	    if(root!=null)
	    	l1.offer(root);
	    else 
	    	return ll;
	    //����Ĺؼ�����ô��������һ�㣿������
	    while(true){ 
	    	List<Integer> li =new ArrayList<Integer>();//���յ�ǰ��Ԫ��ֵ
	    	LinkedList<TreeNode> l2 =new LinkedList<TreeNode>();//������һ��ڵ�
	    while(!l1.isEmpty()){
	    	TreeNode t =l1.poll();
	    	li.add(t.val);
	    	if(t.left!=null){
	    		l2.offer(t.left);
	    	}
	    	if(t.right!=null){
	    		l2.offer(t.right);
	    	}	
	    }
	    ll.add(li);
	    if(l2.isEmpty()){
	    	break;
	    }else{//��һ��
	    	 l1=l2;
	    }
	    }
	    //������һ��������һ����Ľ� 107�Ľ�
	    /*
	    List<List<Integer>> lr =new ArrayList<List<Integer>>();//�����б�
	    int size=ll.size();
	   while(size>0){
		   lr.add(ll.get(--size));
	   }
	    return lr;
	    */
      return ll;
    }
}
