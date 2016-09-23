package leetcode;
/*
 * Given an unsorted array of integers, find the length of longest increasing subsequence.

For example,
Given [10, 9, 2, 5, 3, 7, 101, 18],
The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.

Your algorithm should run in O(n2) complexity.
 */
public class LongSubs {

public int lengthOfLIS(int[] nums) {
        int length=nums.length;
        int c[]=new int[length];
        for(int i=0;i<length;i++){
        	c[i]=1;
        }
        for(int i=1;i<length;i++)
        	for(int j=0;j<i;j++){
        		if(nums[i]>nums[j]&&c[i]>c[j]+1){
        			c[i]=c[j]+1;
        		}
        	}
        int count=1;
        for(int i=0;i<length;i++){
        	if(count<c[i]){
        		count=c[i];
        	}
        }
        return count;
    }
}
/*python´úÂë
 * class Solution(object):
    def lengthOfLIS(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        size = len(nums)
        dp = []
        for x in range(size):
            low, high = 0, len(dp) - 1
            while low <= high:
                mid = (low + high) / 2
                if dp[mid] >= nums[x]:
                    high = mid - 1
                else:
                    low = mid + 1
            if low >= len(dp):
                dp.append(nums[x])
            else:
                dp[low] = nums[x]
        return len(dp)
 */
