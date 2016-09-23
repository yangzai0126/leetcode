package leetcode0511;
/*
 * Given a collection of integers that might contain duplicates, nums, return all possible subsets.

Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
For example,
If nums = [1,2,2], a solution is:

[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]

传统的方式可以解决问题 但是 时间复杂度太高 太高  41ms

 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsettwo {
	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ll = new ArrayList<List<Integer>>();
        int length=nums.length;
        Arrays.sort(nums);
        int high=0;
        int low=0;
        length=(int)Math.pow(2, length);
        for(int j=0;j<length;j++){
        	List<Integer> l =new ArrayList<Integer>();
        	int i=j;
        	while(i!=0){
        		high=i&(i-1);
        		low=i-high;
        		l.add(nums[position(low)-1]);
        		i=high;
        		
        	}
        	if(!ll.contains(l))
        	ll.add(l);
        }
        return ll;
    }


//确定1所在位置 1-32
public  int position(int num){
	int position=0;
	while(num!=0){
		position++;
		num=num/2;
	}
	return position;
}


//另一种方式  subset1成立
public List<List<Integer>> subsets1(int[] nums) {
    List<List<Integer>> ll = new ArrayList<List<Integer>>();
    int length=nums.length;
    Arrays.sort(nums);
    List<Integer> l =new ArrayList<Integer>();
    ll.add(l);
    for(int i=0;i<length;i++){
    	int mid=(int)Math.pow(2, i);
    	for(int j=0;j<mid;j++){
    		List<Integer> li =new ArrayList<Integer>(ll.get(j));
    		li.add(nums[i]);
    		ll.add(li);
    	}
    }
    	
    return ll;
}

//
public List<List<Integer>> subsets2(int[] nums) {
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
