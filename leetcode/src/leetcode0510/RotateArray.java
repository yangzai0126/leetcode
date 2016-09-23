package leetcode0510;
/*
 * Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

Note:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.

[show hint]

Related problem: Reverse Words in a String II

问题是 1 3 5 1 来回循环  所以这种解决办法不行、

？用两个数组显然可以解决问题 

 */
import java.util.*;
public class RotateArray {
	 public void rotate(int[] nums, int k) {
	        int length = nums.length;
	        if(length==0)
	        	return;
	        int i=0;
	        int position=0;
	        int shu=nums[0];
	        int news=0;
	        while(i<length){
	        	int newposition=(position+k)%length;
	        	news=nums[newposition];
	        	nums[newposition]=shu;
	        	shu=news;
	        	position=newposition;
	        	i++;
	        }
	    }
	 
	 //观察结构 Reverse Reverse
	 public void rotater(int[] nums, int k) {
		 int length=nums.length;
		 k=k%length;
		 arrayReverse(nums,0,length-1);
		 arrayReverse(nums,0,k-1);
		 arrayReverse(nums,k,length-1);
	 }
	 public void arrayReverse(int [] nums, int start,int end){
		 int mid=0;
		 while(start<end){
			 mid=nums[end];
			 nums[end--]=nums[start];
			 nums[start++]=mid;
		 }
	 }

}
