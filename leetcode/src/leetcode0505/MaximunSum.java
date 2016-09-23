package leetcode0505;
//��������  
//���ݹ���� һ��Ҫ��ȷ �ݹ鷵�ص�ֵ 
/*
 * Given a binary tree, find the maximum path sum.

For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path does not need to go through the root.

For example:
Given the below binary tree,
�ݹ�Ĺ����� ��Ҫ����ĳЩ�� �ȷ������� 
��Ҫ������������
 */
public class MaximunSum {
	int maxPath=Integer.MIN_VALUE;
	public int maxPathSum(TreeNode root) {
	        dfs(root);
	        return maxPath;
	    }
	public int dfs(TreeNode root){//һ��Ҫ��ȷdfs���ص����Դ˵�Ϊ��ʼ���·����
		int path=0;
		int path1=0;
		if(root==null){
			return 0;
		}
			if(root.left==null&&root.right==null){
				path1=root.val;
			}else{
				//����Ĺؼ������ؽ��  �ڵ��д��ڸ����������
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
				path1= root.val+Math.max(left, right);//���һ����Ҫ��
			}
			if(path1>maxPath){
			    maxPath=path1;
			}
			return path1;
}
}

