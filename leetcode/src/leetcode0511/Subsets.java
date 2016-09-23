package leetcode0511;
import java.util.*;
/*
 * Given a set of distinct integers, nums, return all possible subsets.

Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
For example,
If nums = [1,2,3], a solution is:

[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
//此题借用了bitmanipulation的方法 ，根据每个数1所在的位置添加元素
 */
public class Subsets {
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


}
