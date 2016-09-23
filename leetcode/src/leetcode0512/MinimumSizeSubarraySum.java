package leetcode0512;
/*
 * Given an array of n positive integers and a positive integer s, find the minimal length of a subarray of which the sum �� s. If there isn't one, return 0 instead.

For example, given the array [2,3,1,2,4,3] and s = 7,
the subarray [4,3] has the minimal length under the problem constraint.
ʱ�䳬ʱ ���� ʱ�临�Ӷȵ���O(n)
���������� subarray  ������������
 */
import java.util.Arrays;

public class MinimumSizeSubarraySum {
public int minSubArrayLen(int s, int[] nums) {
        int account=0;
        int length=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--){
        	account+=nums[i];
        	length++;
        	if(account>=s){
        		return length;
        	}
        }
        return 0;
    }
}
