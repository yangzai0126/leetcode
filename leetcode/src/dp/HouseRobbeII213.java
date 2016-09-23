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

//��ʵ�����͵�һ�����һ�� ������Ҫ����dp һ��dp����û��͵��һ�� �ڶ�������͵��һ��
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
	        	int dp[]=new int[length];//dp��ʾ͵���ڼ��� ���Ƿ�Χ  dp��ʾû͵��һ��
	        	int dp1[]=new int[length];//dp1��ʾ͵�˵�һ��
	        	//��ʼ������
	        	dp[0]=0;
	        	dp1[0]=nums[0];
	        	dp[1]=nums[1];
	        	dp1[1]=nums[0];
	        	dp[2]=Math.max(nums[1], nums[2]);
	        	dp1[2]=nums[0]+nums[2];//
	        	for(int i=3;i<length;i++){
	        		dp[i]=Math.max(dp[i-2], dp[i-3])+nums[i];
	        		dp1[i]=Math.max(dp1[i-2], dp1[i-3])+nums[i];//��ʾi���ǽ�β ��ʵdp1[length-1]�����д��ǲ�����Ƚϣ�Ҳ�Ͳ�Ӱ�������ֵ
	        	}
	        	//ע��˴� ��ؼ� ���Ƚϵ�������ǵ���������͵�� �������ڶ���û͵ ͵�� ���һ��û͵ ���ĸ�����ѡ�����ֵ
	        	 max=Math.max(dp1[length-3],max);
	        	 max=Math.max(dp1[length-2],max);
	        	 max=Math.max(dp[length-2],max);
	        	 max=Math.max(dp[length-1],max);
	        			 return max;
	        }
	      
	    }
}
