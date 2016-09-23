package leetcode;
import java.util.*;
/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

two  sum 的区别是 这次是返回 下标  时间复杂度降为O(n^2) 如果只是找到满足这种情况的值 可以先排序 然后两个指针 分别从前和后遍历 复杂度降为排序的时间复杂度
 */
/*可以用哈希表来做
 * 
 */
public class TwoSum {

/*public int[] twoSum(int[] nums, int target) {
        int [] re=new int[2];
        int flag=0;//用来标记 有没有 满足的数
        int length=nums.length;
        if(length<2){
        	return null; //没有直接返回空
        }else{
        	
        	for(int i=0;i<length-1;i++){
        		for(int j=i+1;j<length;j++){
        			if(nums[i]+nums[j]==target){
        				re[0]=i;
        				re[1]=j;
        				flag=1;
        			   break;
        		}
        	}
        		if(flag==1){
        			break;
        		}
        	}
        }
        if(flag==1){
        	return re;
        }else{
        	return null;
        }
        
    }
    */
	//2 Sum 本身可以考虑用哈希表来实现
	//对于返回值是下表 的都可以考虑用哈希表来实现
public int[] twoSum(int[] nums, int target) {
	HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	int length=nums.length;
	int [] re=new int[2];
	for(int i=0;i<length;i++){
		if(hm.containsKey(target-nums[i])){
			
			re[0]=hm.get(target-nums[i]);
			re[1]=i;
			break;
		}else{
			hm.put(nums[i], i);
		}
	}
	return re;
	

}
}
