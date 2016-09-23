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
	    LinkedList<TreeNode> l1 =new LinkedList<TreeNode>();//队列存储当前层
	    List<List<Integer>> ll =new ArrayList<List<Integer>>();//返回列表
	    if(root!=null)
	    	l1.offer(root);
	    else 
	    	return ll;
	    //问题的关键是怎么区分是哪一层？明白了
	    while(true){ 
	    	List<Integer> li =new ArrayList<Integer>();//接收当前层元素值
	    	LinkedList<TreeNode> l2 =new LinkedList<TreeNode>();//接收下一层节点
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
	    }else{//下一层
	    	 l1=l2;
	    }
	    }
	    //下面这一部分是下一个题的解 107的解
	    /*
	    List<List<Integer>> lr =new ArrayList<List<Integer>>();//返回列表
	    int size=ll.size();
	   while(size>0){
		   lr.add(ll.get(--size));
	   }
	    return lr;
	    */
      return ll;
    }
}
