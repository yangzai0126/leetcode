package dp;

import java.util.Arrays;

/*
 * 152. Maximum Product Subarray  QuestionEditorial Solution  My Submissions
Total Accepted: 67513
Total Submissions: 292214
Difficulty: Medium
Find the contiguous subarray within an array (containing at least one number) which has the largest product.

For example, given the array [2,3,-2,4],
the contiguous subarray [2,3] has the largest product = 6.
 */

//注意该题目是要求 乘积最大化  连续子数组  需要两个数组 维持最小和最大 dp穷举
public class MaximumProductSubarray {
	//算法可行但是时间复杂度太高  其他解决办法就是 
public int maxProduct(int[] nums) {
	   int length =nums.length;
	   int dp[][] =new int[length][length];
	   for(int i=0;i<length;i++){
		   dp[i][i]=nums[i];
		   for(int j=i+1;j<length;j++)
			   dp[i][j]=dp[i][j-1]*nums[j];
	   }
	   int max=Integer.MIN_VALUE;
	   for(int i=0;i<length;i++)
		   for(int j=i;j<length;j++){
			   if(max<dp[i][j]){
				   max=dp[i][j];
			   }
		   }
	   return max;
        
    }
public int maxProduct1(int[] nums) {
	   int length =nums.length;
	   if(length==1)
		   return nums[0];
	   int mindp[]=new int[length];//里面的数都小于0
	   int maxdp[]=new int[length];//里面都大于0
	   int flag=0;//标志前面的是参与了最大还是最小 flag 有三种选择  0 1 -1
	   for(int i=0;i<length;i++){
		   if(nums[i]>0){
			   if(flag==1){
				   maxdp[i]=maxdp[i-1]*nums[i];
			       mindp[i]=nums[i]*mindp[i-1];
			   }
			   else if(flag==0){
				   maxdp[i]=nums[i];
				   mindp[i]=nums[i];
				   flag=1;
			   }else{
				   mindp[i]=mindp[i-1]*nums[i];
				   maxdp[i]=nums[i]*maxdp[i-1];
				   flag=-1;
			   }
		   }else if(nums[i]<0){
			   if(flag==-1){
				   maxdp[i]=mindp[i-1]*nums[i];
				   mindp[i]=nums[i]*maxdp[i-1];
				   flag=1;
			   }
			   else if(flag==0){
				   mindp[i]=nums[i];
				   maxdp[i]=nums[i];
				   flag=-1;
			   }else{
				   mindp[i]=maxdp[i-1]*nums[i];
				   maxdp[i]=mindp[i-1]*nums[i];
				   flag=-1;
			   }
		   }else{
			   flag=0;
		   }
	   }
	  Arrays.sort(maxdp);
	  return maxdp[length-1];
     
 }

int maxProduct3(int nums[]){
	int length=nums.length;
	int result=nums[0];
	int maxlocal=nums[0];
	int minlocal=nums[0];
	for(int i=1;i<length;i++){//选择区间的终点
		int maxcopy=maxlocal;
		maxlocal=Math.max(Math.max(maxlocal*nums[i], nums[i]),nums[i]*minlocal);
		minlocal=Math.min(Math.min(maxcopy*nums[i], nums[i]),nums[i]*minlocal);
		result=Math.max(result, maxlocal);
	}
	return result;
			
}
}
