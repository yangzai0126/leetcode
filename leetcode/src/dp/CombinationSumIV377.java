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

������coin change�ĸ��Ӱ�ǳ����Ƶ������е�򵥣���� 1,3 ��3 �� 1��������� �����coinchangge������һ��������е㸴��
 */
import java.util.Arrays;

public class CombinationSumIV377 {
	 public int combinationSum4(int[] nums, int target) {
	        int dp[]=new int[target+1];
	        dp[0]=1;//Ǯ��Ϊ0 ��һ��
	        int length=nums.length;
	        Arrays.sort(nums);//����
	        for(int i=1;i<=target;i++)
	        for(int j=0;j<length;j++){
	        	if(i>=nums[j]){
	        		dp[i]+=dp[i-nums[j]];//�Բ�ͬ��ֵ��ʼ 
	        	}else
	        		break;//�����ǰǮ С����ֵ ������ ��Ǯ������
	        }
	        return dp[target];
	    }
}
