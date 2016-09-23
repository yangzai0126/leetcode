package leetcode0512;
import java.util.*;
/*
 * Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.

Ensure that numbers within the set are sorted in ascending order.


Example 1:

Input: k = 3, n = 7

Output:

[[1,2,4]]

Example 2:

Input: k = 3, n = 9

Output:

[[1,2,6], [1,3,5], [2,3,4]]
 */
public class CombinationSumThree {
public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> rel = new ArrayList<List<Integer>>();
        backTracking(rel,new ArrayList<Integer>(),0,n,k,1);
        return rel;
    }
public void backTracking(List<List<Integer>> ll, List<Integer> l ,int sum,int target,int k ,int start){
	if(k==0&&sum==target){
		ll.add(new ArrayList<Integer>(l));
	}
	if(k>0){
		if(sum>=target){
			return;
		}
		for(int i=start;i<10;i++){
			if(sum+i>target){
				return;
			}
			l.add(i);
			backTracking(ll,l,sum+i,target,k-1,i+1);
			l.remove(l.size()-1);
		}
	}else{
		return;
	}
}
}
