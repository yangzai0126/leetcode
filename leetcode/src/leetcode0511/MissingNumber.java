package leetcode0511;
/*
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */
public class MissingNumber {
	 public int missingNumber(int[] nums) {
	        int length=nums.length;
	        int account=length*(length+1)/2;
	        int accounta=0;
	        for(int i=0;i<length;i++){
	        	accounta+=nums[i];
	        }
	        return account-accounta;
	    }
}
