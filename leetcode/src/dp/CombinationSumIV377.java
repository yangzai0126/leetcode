package dp;
/*
 * 377. Combination Sum IV  QuestionEditorial Solution  My Submissions
Total Accepted: 6331
Total Submissions: 16159
Difficulty: Medium
Given an integer array with all positive numbers and no duplicates, find the number of possible combinations that add up to a positive integer target.

Example:

nums = [1, 2, 3]
target = 4

The possible combination ways are:
(1, 1, 1, 1)
(1, 1, 2)
(1, 2, 1)
(1, 3)
(2, 1, 1)
(2, 2)
(3, 1)

Note that different sequences are counted as different combinations.

Therefore the output is 7.

这个题和coin change的复杂版非常相似但是又有点简单，这个 1,3 和3 ， 1算两种情况 如果是coinchangge则属于一种情况就有点复杂
 */
import java.util.Arrays;

public class CombinationSumIV377 {
	 public int combinationSum4(int[] nums, int target) {
	        int dp[]=new int[target+1];
	        dp[0]=1;//钱数为0 算一种
	        int length=nums.length;
	        Arrays.sort(nums);//排序
	        for(int i=1;i<=target;i++)
	        for(int j=0;j<length;j++){
	        	if(i>=nums[j]){
	        		dp[i]+=dp[i-nums[j]];//以不同面值开始 
	        	}else
	        		break;//如果当前钱 小于面值 换不开 则钱数增加
	        }
	        return dp[target];
	    }
}
