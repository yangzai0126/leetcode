package bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
	    LinkedList<TreeNode> l1 =new LinkedList<TreeNode>();//队列存储当前层
	    List<List<Integer>> ll =new ArrayList<List<Integer>>();//返回列表
	    if(root!=null)
	    	l1.offer(root);
	    else 
	    	return ll;
	    //问题的关键是怎么区分是哪一层？明白了 表明是从左还是从右
	    int left =1;//从左 0 为从右
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
	    if(left==1){
	    ll.add(li);
	    left=0;
	    }else{
	    	List<Integer> lir =new ArrayList<Integer>();//接收反转元素
	    	int size =li.size();
	    	while(size>0){
	    		lir.add(li.get(--size));
	    	}
	    	ll.add(lir);
	    	left=1;
	    }
	    if(l2.isEmpty()){
	    	break;
	    }else{//下一层
	    	 l1=l2;
	    }
	    }
	   
      return ll;
    }
}
