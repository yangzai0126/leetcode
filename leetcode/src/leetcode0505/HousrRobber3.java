package leetcode0505;
/*
 * The thief has found himself a new place for his thievery again. There is only one entrance to this area, called the "root." Besides the root, each house has one and only one parent house. After a tour, the smart thief realized that "all houses in this place forms a binary tree". It will automatically contact the police if two directly-linked houses were broken into on the same night.

Determine the maximum amount of money the thief can rob tonight without alerting the police.

还没做出了  
 */
public class HousrRobber3 {

	public int rob(TreeNode root) {
	     return   dfs(root);
	    }
	public int dfs(TreeNode root){
		if(root == null){
			return 0;
		}
		if(root.left==null&&root.right==null){
			return root.val;
		}else{
			return Math.max(root.val,dfs(root.left)+dfs(root.right));
		}
	}
}
