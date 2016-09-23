package backtracking;
import java.util.*;
//用回溯法 解决 不行 主要是不能确保 唯一 
public class Sum3 {
public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ll = new ArrayList<List<Integer>>();
        return ll;
    }
public void backtrack(int k,int n,int []s,int []nums,boolean[] u,List<List<Integer>> ll){
	if(k==3){
		
	}
	List<Integer> li =new ArrayList<Integer>();
	for(int i=0;i<n;i++){
		if(!u[i]){
			if(!li.contains(nums[i])){
				
			}
		}
	}
}
}
