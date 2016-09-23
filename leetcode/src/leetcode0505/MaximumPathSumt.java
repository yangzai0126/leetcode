package leetcode0505;
/*
 * 由于 上一个版本不能解决问题 这是更新版本；
 */
public class MaximumPathSumt {
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
			int left=0;//奉献给上一层的
			int right=0;//[-2,1]
			int left1=0;
			int right1=0;
			int left2=0;//自身的
			int right2=0;
			int rightleft=0;
			int rightright=0;
			if(root.left!=null&&root.right!=null){
				left1=dfs(root.left.left);
				right1=dfs(root.left.right);
				left2=root.left.val+left1+left2;//自身的最大值
				left=root.left.val+Math.max(left1,right1);//奉献给上一层的最大值
				if(left2>maxPath){
					maxPath=left2;
				}
				if(left<0){
					left=0;
				}
				//问题在与root.left和root.right没有进去递归。
				rightleft=dfs(root.right.left);
				rightright=dfs(root.right.right);
				right=root.right.val+Math.max(rightleft,rightright);
				right2=root.right.val+rightleft+rightright;
				if(right2>maxPath){
					maxPath=right;
				}
				if(right<0){
					right=0;
				}
				path=root.val+left+right;
			}else if(root.left==null){
				rightleft=dfs(root.right.left);
				rightright=dfs(root.right.right);
				right=root.right.val+Math.max(rightleft,rightright);
				right2=root.right.val+rightleft+rightright;
				if(right2>maxPath){
					maxPath=right;
				}
				if(right<0){
					right=0;
				}
				path=root.val+right;
			}else{
				left1=dfs(root.left.left);
				right1=dfs(root.left.right);
				left2=root.left.val+left1+left2;//自身的最大值
				left=root.left.val+Math.max(left1,right1);//奉献给上一层的最大值
				if(left2>maxPath){
					maxPath=left2;
				}
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
