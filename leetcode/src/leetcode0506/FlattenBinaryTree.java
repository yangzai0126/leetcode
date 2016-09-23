package leetcode0506;
import java.util.*;
/*
 * Given a binary tree, flatten it to a linked list in-place.

For example,
Given

         1
        / \
       2   5
      / \   \
     3   4   6
The flattened tree should look like:
   1
    \
     2
      \
       3
        \
         4
          \
           5
            \
             6
             
             用栈实现 前序遍历
             
             每次都是用的非递归 发现  时间好慢啊
             呜呜呜呜呜呜呜呜
 */
public class FlattenBinaryTree {
public void flatten(TreeNode root) {
        Stack<TreeNode> s =new Stack<TreeNode>();
        if(root==null){
        	return;
        }else{
        	s.push(root);
        }
        while(!s.isEmpty()){
        	TreeNode cur = s.pop();
        	if(cur.right!=null&&cur.left!=null){
        		s.push(cur.right);
        		s.push(cur.left);
        		cur.right=cur.left;
        		cur.left=null;
        	}else if(cur.left==null&&cur.right!=null){
        		s.push(cur.right);
        	}else if(cur.left!=null&&cur.right==null){
        		s.push(cur.left);
        		cur.right=cur.left;
        		cur.left=null;
        	}else{//最后一种 叶子结点 
        		if(!s.isEmpty()){
        		cur.right=s.peek();
        		}//取栈顶元素时 一定要先判断 栈是否为空
        	}
        }
    }
public void flatten1(TreeNode root,TreeNode ri) {//尝试用递归实现  ri指明遇到叶子结点后 叶子结点指向的下一个 结点
	if(root==null){
		return;
	}
	TreeNode left=root.left;
	TreeNode right=root.right;
	if(left!=null){
		root.left=null;
		root.right=left;
		if(right!=null){
		flatten1(left,right);
		}else{
			flatten1(left,ri);
		}
		flatten1(right,ri);
	}else if(right!=null){//四种情况 都不要忽略
		flatten1(right,ri);
	}else if(left==null&&right==null){
		root.right=ri;
	}
}
}


    class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }