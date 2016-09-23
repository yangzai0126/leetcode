package leetcode0505;
//这个题很难  
//做递归的题 一定要明确 递归返回的值 
/*
 * Given a binary tree, find the maximum path sum.

For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path does not need to go through the root.

For example:
Given the below binary tree,
递归的过程中 不要忽略某些点 先分析问题 
还要处理好特殊情况
 */
public class MaximunSum {
	int maxPath=Integer.MIN_VALUE;
	public int maxPathSum(TreeNode root) {
	        dfs(root);
	        return maxPath;
	    }
	public int dfs(TreeNode root){//一定要明确dfs返回的是以此点为开始的最长路径。
		int path=0;
		int path1=0;
		if(root==null){
			return 0;
		}
			if(root.left==null&&root.right==null){
				path1=root.val;
			}else{
				//问题的关键是着重解决  节点中存在负数的情况。
				int left= dfs(root.left);
				int right = dfs(root.right);
				if(left<0){
					left=0;
				}
				if(right<0){
					right=0;
				}
				path=root.val+left+right;
				if(path>maxPath){
					maxPath=path;
				}
				path1= root.val+Math.max(left, right);//这个一定不要动
			}
			if(path1>maxPath){
			    maxPath=path1;
			}
			return path1;
}
}

