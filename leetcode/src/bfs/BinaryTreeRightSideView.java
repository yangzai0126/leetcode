package bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeRightSideView {
	public List<Integer> levelOrder(TreeNode root) {
	    LinkedList<TreeNode> l1 =new LinkedList<TreeNode>();//队列存储当前层
	   List<Integer> ll =new ArrayList<Integer>();//返回列表
	    if(root!=null)
	    	l1.offer(root);
	    else 
	    	return ll;
	    //问题的关键是怎么区分是哪一层？明白了
	    while(true){ 
	    	ll.add(l1.get(l1.size()-1).val);
	    	LinkedList<TreeNode> l2 =new LinkedList<TreeNode>();//接收下一层节点
	    while(!l1.isEmpty()){
	    	TreeNode t =l1.poll();
	    	if(t.left!=null){
	    		l2.offer(t.left);
	    	}
	    	if(t.right!=null){
	    		l2.offer(t.right);
	    	}	
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
