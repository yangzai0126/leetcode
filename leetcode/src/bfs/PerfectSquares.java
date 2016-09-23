package bfs;
/*
 * 279. Perfect Squares  QuestionEditorial Solution  My Submissions
Total Accepted: 44535
Total Submissions: 131220
Difficulty: Medium
Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9.

Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
 */
public class PerfectSquares {
public int numSquares(int n) {
	int end =(int) Math.sqrt(n);
	int dp[]=new int[n+1];
	dp[0]=0;
	for(int i=1;i<=n;i++){
		dp[i]=Integer.MAX_VALUE-1;
	}
	//可能需要赋初始值
	for(int i=1;i<=n;i++)
		for(int j=1;j<=end;j++){
			if(i>=j*j)
			dp[i]=Math.min(dp[i], dp[i-j*j]+1);
			else
				break;
		}
      return dp[n];
    }
}
