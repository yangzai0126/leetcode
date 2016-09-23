package leetcode;
/*
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */
public class MoveZeros {

public void moveZeroes(int[] nums) {
       /* int length=nums.length;   //没有保持顺序
        int j=length-1;
        while(j>=0&&nums[j]==0){
        	j--;
        }//j从后面d第一个不为0的下标
        for(int i=0;i<j;i++){
        	if(nums[i]==0){
        		nums[i]=nums[j];
        		nums[j]=0;
        		j--;
        	}
        }
        */
	//虽然保持了顺序 ，但是没有遵守规则  nums有一个副本
	/*
	int length=nums.length;
	int c[]=new int[length];
	int j=0;
	for(int i=0;i<length;i++){
		if(nums[i]!=0){
			c[j++]=nums[i];
		}
	}
	for(int i=0;i<length;i++){
		nums[i]=c[i];
	}
	*/
	int length=nums.length;
	int i=0;
	for(int j=0;j<length;j++){
		if(nums[j]==0){
			i++;
		}else{
			if(i!=0){
				nums[j-i]=nums[j];
			}
		}
	}
	for(int j=0;j<i;j++){
		nums[--length]=0;
	}
    }
}
