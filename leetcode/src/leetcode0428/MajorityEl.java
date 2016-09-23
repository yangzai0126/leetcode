package leetcode0428;
import java.util.*;
/*
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times. 
 * The algorithm should run in linear time and in O(1) space.
 */
//也可以排序
public class MajorityEl {

public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        List<Integer> l =new ArrayList<Integer>();
        int length=nums.length;
        int count=length/3+1;
    	int lin=0;
    	if(length==1){
    		l.add(nums[0]);
    	}else if(length==2){
    		l.add(nums[0]);
    		if(nums[1]!=nums[0]){
    			l.add(nums[1]);
    		}
    	}else {
    	for(int i=0;i<length;i++){// 如果length小于2 则不会将 数字添加  实际上是要添加的
    		if(hm.containsKey(nums[i])){
    			lin= hm.get(nums[i]);
    			if(lin==count-1){
    				l.add(nums[i]);
    			}
    			hm.put(nums[i], lin+1);
    		}else{
    			hm.put(nums[i], 1);
    		}
    	}
    	}
    	return l;
    }
}
