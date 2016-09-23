package leetcode0511;
/*
 * Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

Note:
All numbers (including target) will be positive integers.
Elements in a combination (a1, a2, �� , ak) must be in non-descending order. (ie, a1 �� a2 �� �� �� ak).
The solution set must not contain duplicate combinations.
For example, given candidate set 2,3,6,7 and target 7, 
A solution set is: 
[7] 
[2, 2, 3] 


��Ȼ��Ŀ������   ���� ʱ�临�Ӷ� ̫�� 25ms  ��õ���5ms ��������� ��Ӳ��  ��ʵ��������һ���� �������Ҹо�����һЩ
//��ʹ�������������µĸĽ� ��Ȼ����
 * ������ѧϰ ���ݵķ�����
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	public List<List<Integer>> subsets2(int[] nums,int target) {
	    List<List<Integer>> ll = new ArrayList<List<Integer>>();
	    List<List<Integer>> llr = new ArrayList<List<Integer>>();
	    int length=nums.length;
	    Arrays.sort(nums);
	    List<Integer> l =new ArrayList<Integer>();
	    l.add(0);
	    ll.add(l);
	    if(length>0){
	    	List<Integer> l1 =new ArrayList<Integer>();
	    	l1.add(nums[0]);
	    	int sum =nums[0];
	    	while(sum<=target){
	    		if(sum==target){
	    			List<Integer> li =new ArrayList<Integer>(l1);
	    			li.remove(li.size()-1);
	    			li.add(nums[0]);
	    			llr.add(li);
	    			break;
	    		}else{
	    		List<Integer> li =new ArrayList<Integer>(l1);
	    		li.remove(li.size()-1);
	    		li.add(nums[0]);
	    		li.add(sum);
	    		ll.add(li);
	    		l1=li;
	    		sum=sum+nums[0];
	    		}
	    	}
	    }
	    int newList= 1;
	    int rm=0;
	    int sm=0;
	    while(length>0&&nums[length-1]>target){
	    	length--;
	    }//��һ��ȷ��������С�ڵ���target
	    for(int i=1;i<length;i++){
	    	//int start=0;//ÿһ�ο�ʼ
	    	//int end=0;//ÿһ�ν���
	    	
	    	if(nums[i]==nums[i-1]){
	    	//end=ll.size();
	    		continue;
	    	}
	    	//else{
	    //		end=ll.size();
	    //		start=end-newList;//ֻ������һ�θ��µ�����
	    	//}
	    	//newList=0;
	    	int end =ll.size();
	    	for(int j=0;j<end;j++){
	    		List<Integer> li =new ArrayList<Integer>(ll.get(j));
	    		rm=li.get(li.size()-1);
	    		sm=rm+nums[i];
	    		while(sm<=target){
		    		if(sm==target){
		    			List<Integer> lii =new ArrayList<Integer>(li);
		    			lii.remove(lii.size()-1);
		    			lii.add(nums[i]);
		    			llr.add(lii);
		    			break;
		    		}else{
		    		List<Integer> lii =new ArrayList<Integer>(li);
		    		lii.remove(lii.size()-1);
		    		lii.add(nums[i]);
		    		lii.add(sm);
		    		ll.add(lii);
		    	//	newList++;
		    		li=lii;
		    		sm=sm+nums[i];
		    		}
		    	}
	    	}
	    }
	    return llr;
	}
}
