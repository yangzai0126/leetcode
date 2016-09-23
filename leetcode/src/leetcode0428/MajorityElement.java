package leetcode0428;

import java.util.*;
/*
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Credits:
Special thanks to @ts for adding this problem and creating all test cases.

Subscribe to see which companies asked this question

本题也可采用分治的思想  ，若存在一个数 则 这个数一定是 二分后的那个数  递归

本题还可以用哈希表
 */
public class MajorityElement {

public int majorityElement(int[] nums) {
        Arrays.sort(nums);//先排序 时间复杂度O(nlgn)
        int length=nums.length;
        if(length==1){
        	return nums[0];
        }
        int mcount=length/2;
        int end=mcount-1;
        if(length%2!=0){
        	end=mcount;
        }
        int count=1;
        int re=nums[0];
        for(int i=1;i<=end;i++){//因为题目设定必须存在 所以这个数字的最晚开始就是如果是偶数时length/2;如果是奇数是length/2+1
        	if(nums[i]==nums[i-1]){
        		count++;//如果前后相等 则count++;
        		if(count==mcount+1){
        			return re;
        		}
        	}else{
        		re=nums[i];
        		count=1;
        	}
        }
        return re;
    }

//用hash表实现
public int majorityElementhash(int[] nums) {
	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	int re=nums[0];
	int length=nums.length;
	int count=length/2+1;
	int lin=0;
	for(int i=0;i<length;i++){
		if(hm.containsKey(nums[i])){
			lin= hm.get(nums[i]);
			if(lin==count-1){
				return nums[i];
			}
			hm.put(nums[i], lin+1);
		}else{
			hm.put(nums[i], 1);
		}
	}
	return re;
}
//排完序 的中间一个就是 
public int majorityElement2(int[] nums) {  
    Arrays.sort(nums);//先排序 时间复杂度O(nlgn)
    int length=nums.length;
    return nums[length/2];
}

}
