package dp;
/*
 * 63. Unique Paths II  QuestionEditorial Solution  My Submissions
Total Accepted: 74399
Total Submissions: 247420
Difficulty: Medium
Follow up for "Unique Paths":

Now consider if some obstacles are added to the grids. How many unique paths would there be?

An obstacle and empty space is marked as 1 and 0 respectively in the grid.

For example,
There is one obstacle in the middle of a 3x3 grid as illustrated below.

[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]
The total number of unique paths is 2.
 */

//������unique path һ������������Ҫ�жϵ�ǰ���Ƿ�Ϊ1���Ϊ1 ��ǰ�ڵ�ɴ�·��Ϊ0
public class UniquePathsII63 {
public int uniquePathsWithObstacles(int[][] obstacleGrid) {
	int m=obstacleGrid.length;
	int n=obstacleGrid[0].length;
	int dp[][]=new int[m][n];
	if(obstacleGrid[0][0]==1){
		return 0;
	}else{
		dp[0][0]=1;
	}
	for(int i=1;i<n;i++){
		if(obstacleGrid[0][i]==1)
			dp[0][i]=0;
		else
			dp[0][i]=dp[0][i-1];
	}
	for(int i=1;i<m;i++){
		if(obstacleGrid[i][0]==1)
			dp[i][0]=0;
		else
			dp[i][0]=dp[i-1][0];
	}
	for(int i=1;i<m;i++)
		for(int j=1;j<n;j++){
			if(obstacleGrid[i][j]==1)
				dp[i][j]=0;
			else
			dp[i][j]=dp[i-1][j]+dp[i][j-1];
		}
	
        return dp[m-1][n-1];
        
    }
}
