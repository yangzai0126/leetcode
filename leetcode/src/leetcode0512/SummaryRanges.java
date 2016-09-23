package leetcode0512;
import java.util.*;
/*
 * Given a sorted integer array without duplicates, return the summary of its ranges.

For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 */
public class SummaryRanges {
public List<String> summaryRanges(int[] nums) {
        List<String> ls =new ArrayList<String>();
        int start=0;
        int length=nums.length;
        if(length==0){
        	return ls;
        }
        if(length==1){
        	StringBuilder sb =new StringBuilder(String.valueOf(nums[0]));
        	ls.add(sb.toString());
        	return ls;
        }
        for(int i=1;i<length;i++){
        	if(nums[i]!=nums[i-1]+1){
        		StringBuilder sb=new StringBuilder(String.valueOf(nums[start]));
        		if(i-1!=start){
        			sb.append("->");
        			sb.append(String.valueOf(nums[i-1]));
        			ls.add(sb.toString());
        		}else{
        			ls.add(sb.toString());
        		}
        		start=i;
        	}
        }
        if(start==length-1){
        	StringBuilder sb =new StringBuilder(String.valueOf(nums[length-1]));
        	ls.add(sb.toString());
        }else{
        	StringBuilder sb=new StringBuilder(String.valueOf(nums[start]));
        	sb.append("->");
			sb.append(String.valueOf(nums[length-1]));
			ls.add(sb.toString());
        }
        return ls;
    }
}
