package leetcode0503;
/*
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
the contiguous subarray [4,−1,2,1] has the largest sum = 6.
其实和sellstock是一样的 确定新的起点的条件
//动态规划 
 * 其实此题可以用 分治的思想求解
 */
public class MaximumSubarray {

public int maxSubArray(int[] nums) {
        int length=nums.length;
        int max=nums[0];
        int first=0;
        int last=0;
        int nowmax=nums[0];
        for(int i=1;i<length;i++){
        	if(nowmax<0){//更新新的起点
        		first=i;
        		nowmax=nums[i];
        	}else{
        		nowmax+=nums[i];
        	}
        	if(nowmax>max){
        		max=nowmax;
        		last=i;
        	}
        	
        }
	return max;
    }
}
