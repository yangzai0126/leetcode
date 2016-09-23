package leetcode0512;
/*
 * Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

Each number in C may only be used once in the combination.

和上一题几乎是一样的 只是不可以重复使用 每个最多只能用一次
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumt {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> rst = new ArrayList<>();
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
//主要更改部分就是这
    for(int i=pos; i<candidates.length; i++){
        if(sum+candidates[i] > target) break;
        if( i != pos && candidates[i] == candidates[i-1]) continue;
        path.add(candidates[i]);
        helper(rst, path, sum+candidates[i], candidates, target, i+1);
        path.remove(path.size()-1);
    }
		}
}
