package leetcode0512;
/*
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

Note:
You must not modify the array (assume the array is read only).
You must use only constant, O(1) extra space.
Your runtime complexity should be less than O(n2).
There is only one duplicate number in the array, but it could be repeated more than once.

这个题显然可以这么做 但是空间复杂度就要高很多不是O(1)
 */
public class FindtheDuplicateNumber {
public int findDuplicate(int[] nums) {
	    int n=nums.length-1;
	    if(n<=1){
	    	return n;
	    }
	    int length=n/32+1;
	    int bitm[]=new int[length];
	    int index=0;
	    int offset=0;
	    for(int i=0;i<=n;i++){
	    	index=nums[i]/32;
	    	offset=nums[i]%32;
	    	if((bitm[index]&(1<<offset))==0){
	    		bitm[index]|=(1<<offset);
	    	}else{
	    		return index*32+offset;
	    	}
	    }
       return 0;
    }

//百度来的
public int findDuplicate1(int[] nums) {  
    int len = nums.length;  
    int low = 1, high = len -1;  
    int mid = 0;  
    while(low<high) {  
        mid = low + (high-low)/2;  
        int c = count(nums, mid);  
        if(c > mid) {  
            high = mid;  
        }else{  
            low = mid+1;  
        }  
    }  
    return low;  
}  
public int count(int[] nums, int mid) {  
    int res = 0;  
    for(int i=0;i<nums.length;i++){  
        if(nums[i]<=mid) res++;  
    }  
    return res;  
}  

}
