package leetcode0505;
/*
 * The thief has found himself a new place for his thievery again. There is only one entrance to this area, called the "root." Besides the root, each house has one and only one parent house. After a tour, the smart thief realized that "all houses in this place forms a binary tree". It will automatically contact the police if two directly-linked houses were broken into on the same night.

Determine the maximum amount of money the thief can rob tonight without alerting the police.

此题可以用 层次遍历加动态规划  层次遍历后类似于robberI
 */
public class HouseRobberThree {
	int maxMoney = 0;
	public int rob(TreeNode root) {
       dfs(root);
       dfs1(root);
       return maxMoney;
    }
	public int dfs(TreeNode root){//首先确定返回值的意义 我们先假设返回的是偷我 能得到的下面的最大值
		int value = 0;
		if(root==null){
			return 0;
		}
		if(root.left==null&&root.right==null){
			value= root.val;
		}else{
			int left=dfs1(root.left);
			int right =dfs1(root.right);
			value=root.val+left+right;
		}
		if(value>maxMoney){
				maxMoney=value;
			}
		return value;
	}
	public int dfs1(TreeNode root){//定义成 不偷能取到的最大值
		int value = 0;
		if(root==null){
			return 0;
		}
		if(root.left==null&&root.right==null){
			return 0;
		}else{
			int left=dfs(root.left);
			int right =dfs(root.right);
			int left1=dfs1(root.left);
			int right1=dfs1(root.right );
			value = Math.max(left+right, left1+right1);
		}
		if(value>maxMoney){
				maxMoney=value;
			}
		return value;
	}
}
