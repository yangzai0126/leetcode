package leetcode;

public class HouseRobber {

public int rob1(TreeNode root) {
        if(root==null){
        	return 0;
        }
        if(root.left!=null&&root.right!=null){
        	return root.val+rob1(root.left.left)+rob1(root.left.right)+rob1(root.right.left)+rob1(root.right.right);
        }else if(root.left!=null){
        	return root.val+rob1(root.left.left)+rob1(root.left.right);
        }else if(root.right!=null){
        	return   root.val+rob1(root.right.left)+rob1(root.right.right);
        }else{
        	return root.val;
        }

    }
public int rob(TreeNode root) {
	if(root==null){
    	return 0;
    }
	return Math.max(rob1(root), rob1(root.left)+rob1(root.right));
}
	
}
 class   TreeNode {
	     int val;
	      TreeNode left;
	     TreeNode right;
	      TreeNode(int x) { val = x; }
	  }