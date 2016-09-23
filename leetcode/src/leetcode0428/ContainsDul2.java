package leetcode0428;

import java.util.HashMap;
/*
 * Given an array of integers and an integer k, find out whether there are two distinct 
 * indices i and j in 
 * the array such that nums[i] = nums[j] and the difference between i and j is at most k.
 */
public class ContainsDul2 {

public boolean containsNearbyDuplicate(int[] nums, int k) {
        
	 HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
     int length=nums.length;
     for(int i=0;i<length;i++){
     	if(hm.containsKey(nums[i])&&(i-hm.get(nums[i]))<=k){//������� ���Ҿ��� С��k��Ϊ��
     		return true;
     	}else{ //���� ���û�� ����� ���� �е��Ǿ��벻���� ����� λ��
     		hm.put(nums[i], i);
     		}
     }
     return false;
    }
}
