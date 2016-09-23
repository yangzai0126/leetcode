package backtracking;
/*
 * Given a collection of distinct numbers, return all possible permutations.

For example,
[1,2,3] have the following permutations:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
 */
//java�� û����ν��ȫ�ֱ���

//���ݷ� ö�� ����  ����  N�ʺ� 
import java.util.*;
public class Permutations46 {
	 public List<List<Integer>> permute(int[] nums) {
	        List<List<Integer>> ll=new ArrayList<List<Integer>>();
	        int length=nums.length;
	        boolean used[]=new boolean[length];
	        int solution[]=new int [length];
	        backtrack(0,length,nums,solution,used,ll);
	        return ll;
	    }
	 public void backtrack(int k,int n,int [] nums,int [] s,boolean [] u,List<List<Integer>> ll){
		 if(k==n){
			List<Integer> l =new ArrayList<Integer>();
			for(int i =0;i<n;i++)
				l.add(s[i]);
			ll.add(l);
			return;
		 }
		 for(int i=0;i<n;i++){
			 if(!u[i]){
				s[k]=nums[i];
				 u[i]=true;
				 backtrack(k+1,n,nums,s,u,ll);
				 u[i]=false;
			 }
		 }
	 }
}
