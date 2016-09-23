package leetcode0512;
import java.util.*;
/*
 * Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

Note:
All numbers (including target) will be positive integers.
Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
The solution set must not contain duplicate combinations.
For example, given candidate set 2,3,6,7 and target 7, 
A solution set is: 
[7] 
[2, 2, 3] ;
这个题非常重要对理解递归的执行过程

 */
public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
	    Arrays.sort(candidates);
	    List<List<Integer>> sets = new ArrayList<List<Integer>>();
	    backTrack(sets,new ArrayList<Integer>(),candidates,0,target,candidates.length-1);
	    return sets;
	}
	public void backTrack(List<List<Integer>> sets,List<Integer> path,int[] nums,int sum,int target,int index){
	    if(sum==target){
	        sets.add(new ArrayList<Integer>(path));
	        return;
	    }
	    if(sum>target){
	        return;
	    }
	    for(int i=index;i>=0;i--){
	        sum += nums[i];
	        path.add(0,nums[i]);
	        backTrack(sets,path,nums,sum,target,i);
	        sum -= nums[i];
	        path.remove(0);//吐出来 整个程序只有一个path  这就是精明之处  
	    }
		}
	
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {List<List<Integer>> rst = new ArrayList<>();
    if(candidates == null || candidates.length == 0){
        return rst;
    }

    Arrays.sort(candidates);
    helper(rst, new ArrayList<Integer>(),0,candidates,target,0);
    return rst;
}

public void helper(List<List<Integer>> rst, List<Integer> path, int sum, int[] candidates, int target, int pos){
    if(sum == target){
        rst.add(new ArrayList<>(path));
        return;
    }

    for(int i=pos; i<candidates.length; i++){
        if(sum+candidates[i] > target) break;
       // if( i != pos && candidates[i] == candidates[i-1]) continue;
        path.add(candidates[i]);//区别在于这
        helper(rst, path, sum+candidates[i], candidates, target, i);
        path.remove(path.size()-1);
    }
		}
}
