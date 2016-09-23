package leetcode0512;
/*
 * Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Solve it without division and in O(n).

For example, given [1,2,3,4], return [24,12,8,6].

Follow up:
Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)

Subscribe to see which companies asked this question
 */
public class ProductofArrayExceptSelf {
public int[] productExceptSelf(int[] nums) {
	int account=1;
	int flag=0;//统计0个数
	int position=0;//位置
	for(int i=0;i<nums.length;i++){
		if(nums[i]!=0){
			account*=nums[i];
		}else{
			flag++;
			position=i;
			if(flag==2){
				break;
			}
		}
	}
		if(flag==2){
			for(int i=0;i<nums.length;i++){
			 nums[i]=0;
			}
		}else if(flag==1){
			for(int i=0;i<nums.length;i++){
				 nums[i]=0;
				}
			nums[position]=account;
		}else
		for(int i=0;i<nums.length;i++){
		nums[i]=account/nums[i];
	}
        return nums;
    }
}
