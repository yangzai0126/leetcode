package leetcode0506;
import java.util.*;;
/*
 * Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [1,3,2].

Note: Recursive solution is trivial, could you do it iteratively?

confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
 */
public class BinaryTreeInOrder {
public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        inOrder(root,l);
        return l;
    }
public void inOrder(TreeNode root, List<Integer> l){
	if(root==null){
		return;
	}else{
		inOrder(root.left,l);//�ݹ��ʱ��ע��  û�ж�root�����޸�
		l.add(root.val);
		inOrder(root.right,l);
	}
}
}
