package leetcode0428;
import java.util.*;
/*
 * Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice in the array, 
 * and it should return false if every element is distinct.

 */
public class ContainsDupli {

	 public boolean containsDuplicate(int[] nums) {
	        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	        int length=nums.length;
	        for(int i=0;i<length;i++){
	        	if(hm.containsKey(nums[i])){
	        		return true;
	        	}else{
	        		hm.put(nums[i], i);
	        		}
	        }
	        return false;
	    }
}
