package leetcode0505;
import java.util.*;
public class BinaryTreeRightSightView {

public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        dfs(root,null,l);
        return l;
    }
public void dfs(TreeNode root, TreeNode left,List<Integer> l){//�ؼ���ÿ����㶼Ҫ֪����left
	if(root==null){
		return;
	}else{
		l.add(root.val);
	}
	if(root.right!=null&&root.left!=null){//ѡ�� left
		dfs(root.right,root.left,l);//����Ϊ�� leftΪ root.left
	}
	if (root.right!=null&&root.left==null){//
		//ѡ��left
		if(left!=null){
		if(left.right!=null){
			left=left.right;
		}else{
			left=left.left;
		}
		}
		dfs(root.left,left,l);
	}
	if(root.left!=null&&root.right==null){// left ��right ��Ϊ��
		if(left!=null){
			if(left.right!=null){
				left=left.right;
			}else{
				left=left.left;
			}
			}
			dfs(root.left,left,l);
	}
	if(root.left==null&&root.right==null){
		//dfs(left,)
	}
	
}
}
