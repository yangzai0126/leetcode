package leetcode0506;
/*
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following is not:
    1
   / \
  2   2
   \   \
   3    3
   
   编程前  先观察 发现规律 很简单
 */
public class SymmetricTree {
	 public boolean isSymmetric(TreeNode root) {
		 if(root==null){
			 return true;
		 }else{
			 return isSymmetric1(root.left,root.right);
		 }
	        
	    }
	 public boolean isSymmetric1(TreeNode p, TreeNode q) {
		 if(p!=null&&q!=null){
		 return p.val==q.val&&isSymmetric1(p.left,q.right)&&isSymmetric1(p.right,q.left);
		 }else if(p==null&&q==null){
			 return true;
		 }else{
	        return false;
		 }
	    }
}
