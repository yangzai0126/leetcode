package leetcode0510;
import java.util.*;
/*
 * Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Subscribe to see which companies asked this question
 */
//其实这个题不用hashtable用随便一个集合类就可以  用hashtable的好处是可以快速判断元素存不存在 所以还是用hashtable
//时间复杂度依然不合格
public class SingleNumber {
	public static void main(String args[]){
		int arr[]={17,12,5,-6,12,4,17,-5,2,-3,2,4,5,16,-3,-4,15,15,-4,-5,-6};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
		
		}System.out.println(singleNumber1(arr));
	}
public int singleNumber(int[] nums) {
        int length = nums.length;
        Map<Integer,Integer> im = new HashMap<Integer,Integer>();
        for(int i=0;i<length;i++){
        	if(im.containsKey(nums[i])){
        		im.remove(nums[i]);
        	}else{
        		im.put(nums[i], nums[i]);
        	}
        }
        if(im.size()==1){
       Collection<Integer> c =im.values();
        Iterator<Integer> it =c.iterator();
        return (Integer)it.next();
        }else{
        	return (Integer)null;
        }
    }
public static int singleNumber1(int[] nums) {
	Arrays.sort(nums);
	int length=nums.length;
	if(length==0){
	    return (Integer)null;
	}
	for(int i=0;i<length-2;){
		if(nums[i]==nums[i+1]){
			i=i+2;
		}else{
			return nums[i];
		}
	}
	return nums[length-1];
}

//非常聪明的做法  因为 除了一个为单数 其他为双数 异或操作可以将两个相同的变成0
public  int singleNumber2(int[] nums) {
	int length=nums.length;
	if(length==0)
		return (Integer)null;
	int result=0;
	for(int i=0;i<length;i++){
		result^=nums[i];
	}
	return result;

}
}
