package leetcode0505;
/*
 * ���� ��һ���汾���ܽ������ ���Ǹ��°汾��
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
			int left=0;//���׸���һ���
			int right=0;//[-2,1]
			int left1=0;
			int right1=0;
			int left2=0;//�����
			int right2=0;
			int rightleft=0;
			int rightright=0;
			if(root.left!=null&&root.right!=null){
				left1=dfs(root.left.left);
				right1=dfs(root.left.right);
				left2=root.left.val+left1+left2;//��������ֵ
				left=root.left.val+Math.max(left1,right1);//���׸���һ������ֵ
				if(left2>maxPath){
					maxPath=left2;
				}
				if(left<0){
					left=0;
				}
				//��������root.left��root.rightû�н�ȥ�ݹ顣
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
				left2=root.left.val+left1+left2;//��������ֵ
				left=root.left.val+Math.max(left1,right1);//���׸���һ������ֵ
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
