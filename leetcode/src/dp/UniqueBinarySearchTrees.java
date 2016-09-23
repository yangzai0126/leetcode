package dp;
/*
 * 96. Unique Binary Search Trees  QuestionEditorial Solution  My Submissions
Total Accepted: 91835
Total Submissions: 238778
Difficulty: Medium
Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

For example,
Given n = 3, there are a total of 5 unique BST's.

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
Subscribe to see which companies asked this question
 */
public class UniqueBinarySearchTrees {
public int numTrees(int n) {
    int dp[] =new int[n+1];
    dp[0]=1;
    dp[1]=1;
    for(int i=2;i<=n;i++){
    	for(int j=1;j<=i;j++){//ѡ����ڵ�
    		dp[i]+=dp[j-1]*dp[i-j];//���������������������  ��ʵ��һ���������Ż� �ж�i��ż����������
    	}
    }
	return dp[n];
	
    }
}
