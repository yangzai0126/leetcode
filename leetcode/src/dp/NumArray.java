package dp;
/*
 * 303. Range Sum Query - Immutable  QuestionEditorial Solution  My Submissions
Total Accepted: 40032
Total Submissions: 155855
Difficulty: Easy
Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

Example:
Given nums = [-2, 0, 3, -5, 2, -1]

sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3
Note:
You may assume that the array does not change.
There are many calls to sumRange function.
 */
public class NumArray {
	
	int []sum;//sum 记录从0到i 所对应的集合的和
public NumArray(int[] nums) {
       int length=nums.length;
       this.sum=new int[length];
       if(length>0)
    	   sum[0]=nums[0];
       for(int i=1;i<length;i++){
    	   sum[i]=sum[i-1]+nums[i];
       }
    }
   
    public int sumRange(int i, int j) {
    	if(i>0)
        return sum[j]-sum[i-1];
    	else
    		return sum[j];
    }
}
