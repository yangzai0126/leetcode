package leetcode0512;
import java.util.*;
/*
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

For example,
If n = 4 and k = 2, a solution is:
 */
public class Combination {
public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> rel = new ArrayList<List<Integer>>();
        backTracking(rel,new ArrayList<Integer>(),1,k,n);
        return rel;
    }
public void backTracking(List<List<Integer>> ll,List<Integer> l,int start,int k,int n){
	if(k==0){
		ll.add(new ArrayList<Integer>(l));
		return;
	}
	if(k>0)
	{
		for(int i=start;i<=n;i++){
			l.add(i);
			backTracking(ll,l,i+1,k-1,n);
			l.remove(l.size()-1);
		}
	}else{
		return;
	}
}
}
