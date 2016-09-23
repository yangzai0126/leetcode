package dp;
/*
 * 213. House Robber II  QuestionEditorial Solution  My Submissions
Total Accepted: 35335
Total Submissions: 110644
Difficulty: Medium
Note: This is an extension of House Robber.

After robbing those houses on that street, the thief has found himself a new place for his thievery so that he will not get too much attention. This time, all houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, the security system for these houses remain the same as for those in the previous street.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 */

//其实这个题和第一题基本一样 就是需要两个dp 一个dp表明没有偷第一家 第二个表明偷第一家
public class HouseRobbeII213 {
	 public int rob(int[] nums) {
	        int length=nums.length;
	        int max=0;
	        if(length==0)
	        	return 0;
	        else if(length<4){
	        	for(int i=0;i<length;i++){
	        		max=Math.max(max, nums[i]);
	        	}
	        	return max;
	        }else{
	        	int dp[]=new int[length];//dp表示偷到第几家 就是范围  dp表示没偷第一家
	        	int dp1[]=new int[length];//dp1表示偷了第一家
	        	//初始化工作
	        	dp[0]=0;
	        	dp1[0]=nums[0];
	        	dp[1]=nums[1];
	        	dp1[1]=nums[0];
	        	dp[2]=Math.max(nums[1], nums[2]);
	        	dp1[2]=nums[0]+nums[2];//
	        	for(int i=3;i<length;i++){
	        		dp[i]=Math.max(dp[i-2], dp[i-3])+nums[i];
	        		dp1[i]=Math.max(dp1[i-2], dp1[i-3])+nums[i];//表示i不是结尾 其实dp1[length-1]计算有错但是不参与比较，也就不影响最后结果值
	        	}
	        	//注意此处 最关键 最后比较的情况就是倒数第三家偷了 ，倒数第二家没偷 偷了 最后一家没偷 这四个数中选出最大值
	        	 max=Math.max(dp1[length-3],max);
	        	 max=Math.max(dp1[length-2],max);
	        	 max=Math.max(dp[length-2],max);
	        	 max=Math.max(dp[length-1],max);
	        			 return max;
	        }
	      
	    }
}
