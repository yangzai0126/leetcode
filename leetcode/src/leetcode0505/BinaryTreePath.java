package leetcode0505;
import java.util.*;
/*
 * Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]
 */
public class BinaryTreePath {
public List<String> binaryTreePaths(TreeNode root) {
        List<String> l =new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        dfs(root,sb,l);
        return l;
    }
public void dfs(TreeNode root, StringBuilder sb,List<String> l){
	if(root==null){
		return;
	}else{
		if(sb.length()!=0){
			sb.append("->");
			sb.append(root.val);
		}else{
		sb.append(root.val);
		}
	}
	if(root.left==null&&root.right==null){
		l.add(sb.toString());
	}else{
		if(root.left!=null&&root.right!=null){
			StringBuilder sb1 = new StringBuilder(sb);
			dfs(root.left,sb,l);
			dfs(root.right,sb1,l);
		}else{
			if(root.left!=null){
				dfs(root.left,sb,l);
			}else{
				dfs(root.right,sb,l);
			}
		}
	}
}
}
