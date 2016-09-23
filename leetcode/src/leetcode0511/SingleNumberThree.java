package leetcode0511;
import java.util.*;
/*
 * Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

For example:

Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

Note:
The order of the result is not important. So in the above example, [5, 3] is also correct.
Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
 */

//使用的是bitmap
//此题如果都是正数肯定没有问题 但是 竟然有负数 哎
public class SingleNumberThree {
	public static void main(String args[]){
		int nums[]={1,1};
		System.out.println(subsets2(nums).size());
	}
public static int[] singleNumber(int[] nums) {
        int max = maxNumber(nums);
        System.out.println("max="+max);
        int slength = max/32+1;
        System.out.println("slength"+slength);
        int si[]=new int[slength];
        int r[]=new int[2];
        int flag=0;//当flag==2时说明找到两个
        for(int i=0;i<nums.length;i++){
        	int index=nums[i]/32;
        	int offset=nums[i]%32;
        	si[index]=si[index]^1<<offset;
        }
        for(int i=0;i<slength;i++){
        	if(si[i]!=0){
        		if((si[i]&(si[i]-1))==0){//等于0说明只有一个1
        			r[flag++]=i*32+position(si[i])-1;
        			if(flag==2){
        				break;
        			}
        		}else{
        			r[0]=i*32+position(si[i]&si[i]-1)-1;
        			r[1]=i*32+position(si[i]-(si[i]&si[i]-1))-1;
        			break;
        		}
        	}
        }
        return r;
    }
public static int maxNumber(int [] nums){
	int length = nums.length;
	int max = 0;
	   for(int i=0;i<length;i++){
		   if(nums[i]>max){
			   max=nums[i];
		   }
	   }
	   return max;
}
public static int position(int num){
	int position=0;
	while(num!=0){
		position++;
		num=num/2;
	}
	return position;
}


//最优百度来的标准答案 

public int[] singleNumberbai(int[] nums) {  
    int[] res = new int[2];  
    int result = nums[0];  
    for(int i=1;i<nums.length;i++){  
        result = result^nums[i];  
    }  
    res[0] = 0;  
    res[1] = 0;  
    int n =result- (result & (result-1));  
    for(int i=0;i<nums.length;i++){  
        if((n & nums[i])!=0){  
            res[0] = res[0] ^ nums[i];  
        }else {  
            res[1] = res[1] ^ nums[i];  
        }  
    }  
    return res;  
}  

//
public static List<List<Integer>> subsets2(int[] nums) {
    List<List<Integer>> ll = new ArrayList<List<Integer>>();
    int length=nums.length;
    Arrays.sort(nums);
    List<Integer> l =new ArrayList<Integer>();
    ll.add(l);
    if(length>0){
    	List<Integer> l1 =new ArrayList<Integer>();
    	l1.add(nums[0]);
    	ll.add(l1);
    }
    int newList= 1;
    for(int i=1;i<length;i++){
    	int start=0;//每一次开始
    	int end=0;//每一次结束
    	if(nums[i]!=nums[i-1]){
    	end=ll.size();
    	}else{
    		end=ll.size();
    		start=end-newList;//只更改上一次更新的数量
    		System.out.println(start);
    	}
    	for(int j=start;j<end;j++){
    		List<Integer> li =new ArrayList<Integer>(ll.get(j));
    		li.add(nums[i]);
    		ll.add(li);
    	}
    	newList=end-start;
    }
    return ll;
}
}
