package leetcode0505;
import java.util.*;
public class PathSumTwo {
/*
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
return
[
   [5,4,11,2],
   [5,8,4,5]
]
 */
public List<List<Integer>> pathSum(TreeNode root, int sum) {
	List<Integer> l =new ArrayList<Integer>();
	List<List<Integer>> al =new ArrayList<List<Integer>>();
	dfs(root,sum,l,0,al);
	return al;
        
    }
public void dfs(TreeNode root, int sum,List<Integer> l,int cur,List<List<Integer>> al) {
	if(root==null){
		return;
	}else{
		l.add(root.val);//如果不为空  就加入List
	}
	if(root.left==null&&root.right==null){
		if(cur+root.val==sum){
			al.add(l);
		}
	}else{
			if(root.left!=null&&root.right!=null){
				List<Integer> ll= new ArrayList<Integer>(l);//有两个
				dfs(root.left,sum,l,cur+root.val,al);//执行完这一句 l已经发生改变
				dfs(root.right,sum,ll,cur+root.val,al);
			}else{
				if(root.left!=null){
					dfs(root.left,sum,l,cur+root.val,al);
				}else{
				dfs(root.right,sum,l,cur+root.val,al);
				}
			}
		}
	}
    
}

