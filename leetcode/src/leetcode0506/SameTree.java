package leetcode0506;
/*
 * Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value.

Subscribe to see which companies asked this question
 */
public class SameTree {

public boolean isSameTree(TreeNode p, TreeNode q) {
	if(p!=null&&q!=null){
		return p.val==q.val&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
	}else if(p==null&&q==null){
		return true;
	}else{
        return false;
	}
    }
}
