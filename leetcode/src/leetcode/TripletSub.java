package leetcode;
/*
 * Given an unsorted array return whether an increasing subsequence of length 3 exists or not in the array.

Formally the function should:
Return true if there exists i, j, k 
such that arr[i] < arr[j] < arr[k] given 0 �� i < j < k �� n-1 else return false.
Your algorithm should run in O(n) time complexity and O(1) space complexity.

Examples:
Given [1, 2, 3, 4, 5],
return true.

Given [5, 4, 3, 2, 1],
return false.
 */

public class TripletSub {
	 public boolean increasingTriplet(int[] nums) {
	        int flag=0;//����������������������Ȼ���������ڵĺ���Ĵ���ǰ��ģ���flag��¼�ڶ�������λ��
	        for(int i=1;i<nums.length;i++){
	        	if(flag!=0&&nums[i]>nums[flag]){//���һ��������flag˵������
	        		return true;
	        	}
	        	if(flag!=0&&nums[i]>nums[i-1]&&nums[i]==nums[flag]&&nums[i-1]>nums[flag-1]){//���flag��ͬ�����Լ�ǰ��Ĵ���flagǰ��������
	        		return true;
	        	}
	        	if(nums[i]>nums[i-1]){//���һ��������ǰ��ĵ��ǲ�����flag�����flagλ��
	        		flag=i;
	        	}
	        	
	        	
	        }
	        return false;
	        
	    }
	 /*  ���Žⷨ
	  * public boolean increasingTriplet(int[] nums) {
	      if(nums.length<3){
            return false;
        }
          int a=nums[0];
          int b=0;
	      int j=1;
	      while(j<nums.length-1&&nums[j]<=a){//�� �ж�j�Ƿ�Ϸ�
	      a=nums[j++];
	      }
	      if(j<nums.length-1){
	      b=nums[j];
	      }else{
	          return false;
	      }
	    
	        for(int i=j+1;i<nums.length;i++){
	        	if(nums[i]<=a){
	        	a=nums[i];
	        	}else if(nums[i]<=b){
	        	b=nums[i];
	        	}else
	        	{
	        	return true;
	        	}
	        	
	        }
	        return false;
	        
	    }
	  */

}
