package leetcode0506;
import java.util.*;
public class BinaryTreePostOrder {
public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        postOrder(root,l);
        return l;
    }
public void postOrder(TreeNode root, List<Integer>l){
	if(root==null){
		return ;
	}else{
		postOrder(root.left,l);
		postOrder(root.right,l);
		l.add(root.val);
	}
}
}
