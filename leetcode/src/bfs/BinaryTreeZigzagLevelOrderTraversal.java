package bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
	    LinkedList<TreeNode> l1 =new LinkedList<TreeNode>();//���д洢��ǰ��
	    List<List<Integer>> ll =new ArrayList<List<Integer>>();//�����б�
	    if(root!=null)
	    	l1.offer(root);
	    else 
	    	return ll;
	    //����Ĺؼ�����ô��������һ�㣿������ �����Ǵ����Ǵ���
	    int left =1;//���� 0 Ϊ����
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
	    if(left==1){
	    ll.add(li);
	    left=0;
	    }else{
	    	List<Integer> lir =new ArrayList<Integer>();//���շ�תԪ��
	    	int size =li.size();
	    	while(size>0){
	    		lir.add(li.get(--size));
	    	}
	    	ll.add(lir);
	    	left=1;
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
