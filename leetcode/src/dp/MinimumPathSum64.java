package dp;
/*
 * 64. Minimum Path Sum  QuestionEditorial Solution  My Submissions
Total Accepted: 80306
Total Submissions: 223233
Difficulty: Medium
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

Subscribe to see which companies asked this question
 */
public class MinimumPathSum64 {
public int minPathSum(int[][] grid) {
	  int m=grid.length;
	  int n=grid[0].length;
	  int dp[][]=new int[m][n];
	  dp[0][0]=grid[0][0];
	  for(int i=1;i<n;i++){
		  dp[0][i]=dp[0][i-1]+grid[0][i];
	  }
	  for(int i=1;i<m;i++){
		  dp[i][0]=dp[i-1][0]+grid[i][0];
	  }
	  for(int i=1;i<m;i++)
		  for(int j=1;j<n;j++){
			  dp[i][j]=Math.min(dp[i-1][j], dp[i][j-1])+grid[i][j];
		  }
        return dp[m-1][n-1];
    }
}
