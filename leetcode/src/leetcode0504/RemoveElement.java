package leetcode0504;
/*
 * Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.

//此题很简单 ，也可先排序 再查找
 */
public class RemoveElement {

	 public int removeElement(int[] nums, int val) {
		    int sv=0; 
	        for(int i=0;i<nums.length;i++){
	        	if(nums[i]==val){
	        		sv++;
	        	}else{
	        		nums[i-sv]=nums[i];//sv记录着当指针指到i时，前面有几个与val相同的值
	        	}
	        }
	        return nums.length-sv;
	    }
}
