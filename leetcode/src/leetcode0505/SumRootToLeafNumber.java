package leetcode0505;
/*
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

An example is the root-to-leaf path 1->2->3 which represents the number 123.

Find the total sum of all root-to-leaf numbers.

For example,

    1
   / \
  2   3
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.

Return the sum = 12 + 13 = 25.


 */
public class SumRootToLeafNumber {

public int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }
public int dfs(TreeNode root,int cur){
	int count=0;
	if(root==null){
		return 0;//���Ϊ�� ����0
	}
	if(root.left==null&&root.right==null){
		return count+cur*10+root.val; //����Ҷ�ӽ��
	}else{
		return dfs(root.left,cur*10+root.val)+dfs(root.right,cur*10+root.val);//�������ĺͼ����������ĺ�
	}
	
}
}
