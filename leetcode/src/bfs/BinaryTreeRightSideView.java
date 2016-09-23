package bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeRightSideView {
	public List<Integer> levelOrder(TreeNode root) {
	    LinkedList<TreeNode> l1 =new LinkedList<TreeNode>();//���д洢��ǰ��
	   List<Integer> ll =new ArrayList<Integer>();//�����б�
	    if(root!=null)
	    	l1.offer(root);
	    else 
	    	return ll;
	    //����Ĺؼ�����ô��������һ�㣿������
	    while(true){ 
	    	ll.add(l1.get(l1.size()-1).val);
	    	LinkedList<TreeNode> l2 =new LinkedList<TreeNode>();//������һ��ڵ�
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
	    }else{//��һ��
	    	 l1=l2;
	    }
	    }
      return ll;
    }
}
