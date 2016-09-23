package leetcode0505;

public class MaximunSumPath {
int maxPath=Integer.MIN_VALUE;
public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxPath;
    }
public int dfs(TreeNode root){
	int path=0;
	if(root==null){
		return 0;
	}
		if(root.left==null&&root.right==null){
			path=root.val;
		}else{
			int left=0;
			int right=0;
			if(root.left!=null&&root.right!=null){
				left=root.left.val+Math.max(dfs(root.left.left), dfs(root.left.right));
				if(left<0){
					left=0;
				}
				//问题在与root.left和root.right没有进去递归。
				right=root.right.val+Math.max(dfs(root.right.left),dfs(root.right.right));
				if(right<0){
					right=0;
				}
				path=root.val+left+right;
			}else if(root.left==null){
				right=root.right.val+Math.max(dfs(root.right.left),dfs(root.right.right));
				if(right<0){
					right=0;
				}
				path=root.val+right;
			}else{
				left=root.left.val+Math.max(dfs(root.left.left), dfs(root.left.right));
				if(left<0){
					left=0;
				}
				path=root.val+left;
			}
		}
		if(path>maxPath){
			maxPath=path;
		}
		if(path<0){
			return 0;
		}
	return path;
}
}
