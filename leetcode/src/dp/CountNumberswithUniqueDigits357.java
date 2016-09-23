package dp;
/*
 * 357. Count Numbers with Unique Digits  QuestionEditorial Solution  My Submissions
Total Accepted: 11911
Total Submissions: 27445
Difficulty: Medium
Given a non-negative integer n, count all numbers with unique digits, x, where 0 ≤ x < 10n.

Example:
Given n = 2, return 91. (The answer should be the total numbers in the range of 0 ≤ x < 100, excluding [11,22,33,44,55,66,77,88,99])
 */

//这个题最关键的就是 n可以理解为位数  不重复的数字 包含 1到n 位所包含的不重复数字之和 一个n位数 中含有不重复的数字个数为 9*9*8*(10-n+1)
public class CountNumberswithUniqueDigits357 {
public int countNumbersWithUniqueDigits(int n) {
	int dp[]=new int[n+1];
	int product[]=new int[n+1];
	dp[0]=1;
	if(n==0)
		return 1;
	else
		dp[1]=9;//第一位不能为0
	for(int i=1;i<n&&i<=10;i++){
		dp[i]=(10-i+1)*dp[i-1];//(10-i+1)可以理解为第i位可供选择的数的个数
	}
     product[0]=dp[0];
     for(int i=1;i<=n;i++){
    	 product[i]=product[i-1]+dp[i];
     }
      return product[n];
    }
}
