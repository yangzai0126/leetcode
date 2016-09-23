package leetcode0505;
import java.util.*;
public class BinaryTreeRightSightView {

public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        dfs(root,null,l);
        return l;
    }
public void dfs(TreeNode root, TreeNode left,List<Integer> l){//关键是每个结点都要知道其left
	if(root==null){
		return;
	}else{
		l.add(root.val);
	}
	if(root.right!=null&&root.left!=null){//选择 left
		dfs(root.right,root.left,l);//均不为空 left为 root.left
	}
	if (root.right!=null&&root.left==null){//
		//选择left
		if(left!=null){
		if(left.right!=null){
			left=left.right;
		}else{
			left=left.left;
		}
		}
		dfs(root.left,left,l);
	}
	if(root.left!=null&&root.right==null){// left 和right 均为空
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
