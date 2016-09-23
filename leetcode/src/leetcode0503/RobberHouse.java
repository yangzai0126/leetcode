package leetcode0503;
/*
 * You are a professional robber planning to rob houses along a street. 
 * Each house has a certain amount of money stashed, the only constraint 
 * stopping you from robbing each of them is that adjacent houses have security system 
 * connected and it will automatically contact the police if two adjacent houses 
 * were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, 
determine the maximum amount of money you can rob tonight without alerting the police.
//动态规划 
 */
public class RobberHouse {

	 public int rob(int[] nums) {
		 int length=nums.length;
		 if(length==0){
			 return 0;
		 }
		 if(length==1){
			 return nums[0];
		 }
		 if(length==2){
			 return Math.max(nums[0], nums[1]);
		 }
		 if(length==3){
			 return Math.max(nums[1], nums[0]+nums[2]);
		 }
		 int [] interest=new int[length];//interest 记录盗窃每个房间后产生的利益
		 interest[0]=nums[0];
		 interest[1]=nums[1];
		 interest[2]=nums[0]+nums[2];
		 for(int i=3;i<length;i++){
			 interest[i]=nums[i]+Math.max(interest[i-2], interest[i-3]);
		 }
	        return Math.max(interest[length-1], interest[length-2]);
	    }
}
